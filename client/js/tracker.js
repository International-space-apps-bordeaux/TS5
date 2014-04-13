var map;
var markers = [];
var paths   = [];

var app = {
    satId: "iss",
    way: 1,
    timer: null,
    thick: 0,

    init: function() {
        this.initMap();
        this.bindList();
        this.liveUpdatePosition();
    },

    initMap: function() {
        var mapOptions = {
            center: new google.maps.LatLng(-34.397, 150.644),
            zoom: 6,
            mapTypeId: google.maps.MapTypeId.SATELLITE
        };
        map = new google.maps.Map(
            document.getElementById("map"),
            mapOptions
        );
    },

    bindList: function() {
        var _this = this;
        $('#sat-list li').click(function(k, el){

                $('#sat-list li').removeClass('selected');
                _this.satId = $(this).data('idsat');
                _this.way   = $(this).data('way');
                _this.liveUpdatePosition();
                $('#current-sat').html($(this).html());
                $(this).addClass('selected');

        });
    },

    liveUpdatePosition: function() {
        //Start requesting satellite position each 2 minutes
        var _this = this;
        this.cleanOrbits();
        setInterval(function() {
            _this.getPositions();
        }, 120000);
        _this.getPositions();
    },

    updatePosition: function() {

        this.thick++;
        var startDate = new Date(this.t1.date);
        var endDate = new Date(this.t2.date);
        var seconds = startDate.getSeconds();

        if(startDate.getMinutes() == endDate.getMinutes()) {
            seconds += 60;
        }

        var deltaLat = ((this.t2.latitude - this.t1.latitude) / 120) * this.thick;
        var deltaLng = (this.t2.longitude - this.t1.longitude);
        //If satellite pass over Greenwich, I add a 360 loop on the longitude to avoid a return to 0
        if(this.way == 1) {
            deltaLng = deltaLng < 0 ? deltaLng + 360 : deltaLng;
        }
        deltaLng = (deltaLng / 120) * this.thick;

        var lat = deltaLat + this.t1.latitude;
        var lng = deltaLng + this.t1.longitude;

        var latLng = new google.maps.LatLng(lat, lng);

        this.cleanMarkers();

        var marker = new google.maps.Marker({
            position: latLng,
            map: map,
            title: this.satId
        });

        markers.push(marker);
        map.panTo(latLng)
    },

    cleanMarkers: function() {
        for(i in markers) {
            markers[i].setMap(null);
        }
    },

    cleanOrbits: function() {
        for(i in paths) {
            paths[i].setMap(null);
        }
    },

    getPositions: function() {
        var _this = this;

        var url = "http://10.33.0.33:8080/SatelliteServiceClient/api/satellites/trajectory/"+this.satId;

        $.getJSON(url, function(data) {

            console.info('Data from server');
            console.log(data);

            if(_this.timer) {
                clearInterval(_this.timer);
            }
            _this.thick = 0;

            var t1 = data[0];
            var t2 = data[1];

            _this.printOrbit(data);

            _this.t1 = t1;
            _this.t2 = t2;

            _this.timer = setInterval(function() {
                _this.updatePosition();
            }, 1000);
        });
    },

    printOrbit: function(positions) {
        var pos1 = positions[0];
        var pos2 = positions[1];
        var latLng2 = new google.maps.LatLng(pos2.latitude, pos2.longitude);

        var orbitCoordinates = [
            new google.maps.LatLng(pos1.latitude, pos1.longitude),
            new google.maps.LatLng(pos2.latitude, pos2.longitude)
        ];
        for(var i in positions) {
            orbitCoordinates.push(
                new google.maps.LatLng(positions[i].latitude, positions[i].longitude)
            );
        }
        var orbitPath = new google.maps.Polyline({
            path: orbitCoordinates,
            geodesic: true,
            strokeColor: '#FF0000',
            strokeOpacity: 1.0,
            strokeWeight: 2
        });

        paths.push(orbitPath)

        orbitPath.setMap(map);
    }

}

$(function() {
    app.init();
})
