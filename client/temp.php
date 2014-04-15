<?php

header('Content-type: application/json');

$output = array();

$startLat = 40;
$startLng = 0;

$endLat = 60;
$endLng = 80;

$step = 10;

for($i=0;$i<$step;$i++) {
    $lat = $startLat + ((( $endLat - $startLat) / $step ) * $i);
    $lng = $startLng + ((( $endLng - $startLng) / $step ) * $i);

    $now = new DateTime('now + '.($i*2).' minutes');

    array_push($output, array(
        'latitude' => $lat,
        'longitude' => $lng,
        'date'      => $now->format('Y-m-d H:i:s')
    ));
}

echo json_encode($output);

?>
