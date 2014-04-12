var map;

var app = {
    init: function() {

        var mapOptions = {
            center: new google.maps.LatLng(-34.397, 150.644),
            zoom: 6,
            mapTypeId: google.maps.MapTypeId.SATELLITE
        };
        map = new google.maps.Map(
            document.getElementById("map"),
            mapOptions
        );

        this.liveUpdatePosition();
    },

    liveUpdatePosition: function() {
        var _this = this
        setInterval(function() {
            _this.getPosition();
        }, 1000);
    },

    updatePosition: function(position) {

        var latLng = new google.maps.LatLng(position.lat, position.lng);
        map.panTo(latLng)
    },

    getPosition: function() {
        var _this = this;

        $.getJSON('http://api.open-notify.org/iss-now.json?callback=?', function(data) {
            var lat = data['iss_position']['latitude'];
            var lng = data['iss_position']['longitude'];

            _this.updatePosition({lat: lat, lng: lng});
        });
    }
}

$(function() {
    app.init();
})
