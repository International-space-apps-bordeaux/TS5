var map;

var mapOptions = {
    center: new google.maps.LatLng(-34.397, 150.644),
    zoom: 6,
    mapTypeId: google.maps.MapTypeId.SATELLITE
};
map = new google.maps.Map(
    document.getElementById("map"),
    mapOptions
);
