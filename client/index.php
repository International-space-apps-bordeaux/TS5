<?php
$baseUrl = "spope/";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Follow Sat</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link href="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/css/layout.css" rel="stylesheet" media="screen">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBYOgoKO_QD7cFxGwfqenxkch9SZlU59bU&sensor=false"></script>
        <script src="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/js/tracker.js"></script>
</head>
<body>
    
    <div class="container">
        <div class="row">
            <h1 class="col-md-12">Follow Sat</h1>
        </div>

        <div class="row">
            <div class="col-md-2 col-md-offset-10">
                <p>Currently tracking : <span id="current-sat">ISS</span></p>
            </div>
            <div id="map" class="col-md-10 col-md-offset-1"></div>
            
        </div>

        <div class="row">
            <div class="col-md-6">
                <ul class="list-unstyled" id="sat-list">
                    <li data-idsat="iss" data-way="1">ISS</li>
                    <li data-idsat="aim" data-way="0">AIM</li>
                    <li data-idsat="fast" data-way="0">Fast</li>
                </ul>
            </div>
        </div>

        <div class="row">
        </div>
    </div>

</body>
</html>
