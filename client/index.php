<?php
$baseUrl = "";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Follow Sat</title>
<script type="text/javascript">
    var picto = "http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/picto.png";
</script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link href="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/css/layout.css" rel="stylesheet" media="screen">

        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBYOgoKO_QD7cFxGwfqenxkch9SZlU59bU&sensor=false"></script>
        <script src="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/js/tracker.js"></script>
	<link rel="icon" href="favicon.ico"/>
</head>
<body>
    
    <div id="container">
      <div id="load"><img src="load.gif" /></div>
      <div id="map" class="col-md-10 col-md-offset-1"></div>
      
      <div id="up-menu">
	<div id="menu">
	  <div id="title">
            <h1>Follow Sat</h1>
	  </div>
	  <div id="list">
	    <ul id="sat-list">
              <li class="selected" data-idsat="iss" data-way="1"><p>ISS</p></li>
              <li data-idsat="aim" data-way="0"><p>AIM</p></li>
              <li data-idsat="fast" data-way="1"><p>Fast</p></li>
            </ul>
	  </div>
	</div>
      </div>
      <div id="document">
	<div id="iss" class="description">
	  <p>	The International Space Station (ISS) is a space station, a habitable artificial satellite in low Earth orbit. The ISS serves as a microgravity and space environment research laboratory in which crew members conduct experiments in biology, human biology, physics, astronomy, meteorology and other fields.</br>The station is suited for the testing of spacecraft systems and equipment required for missions to the Moon and Mars.
      </p>

      <div style="text-align:center;">
        <iframe width="480" height="302" src="http://www.ustream.tv/embed/9408562?ub=85a901&amp;lc=85a901&amp;oc=ffffff&amp;uc=ffffff&amp;v=3&amp;wmode=direct" scrolling="no" frameborder="0" style="border: 0px none transparent;">    </iframe><br /><a href="http://www.ustream.tv/" style="padding: 2px 0px 4px; width: 400px; background: #ffffff; display: block; color: #000000; font-weight: normal; font-size: 10px; text-decoration: underline; text-align: center;" target="_blank">Live streaming video by Ustream</a>
      </div>
	</div>
	<div id="aim" class="description">
	  <p>	The Aeronomy of Ice in the Mesosphere (AIM) satellite mission is exploring Polar Mesospheric Clouds (PMCs), also called noctilucent clouds, to find out why they form and why they are changing.
	    The primary goal of the AIM mission is to help scientists understand whether the clouds' ephemeral nature, and their variation over time, is related to Earth's changing climate - and to investigate why they form in the first place. By measuring the thermal, chemical and other properties of the environment in which the mysterious clouds form, the AIM mission will provide researchers with a foundation for the study of long-term variations in the mesosphere and its relationship to global climate change.
	    In addition to measuring environmental conditions, the AIM mission will collect data on cloud abundance, how the clouds are distributed, and the size of particles within them.
	  </p>
	</div>
	<div id="fast" class="description">
	  <p>	The FAST (Fast Auroral Snapshot Explorer) satellite is a highly sophisticated scientific satellite designed to carry out in situ measurements of acceleration physics and related plasma processes associated with the Earth's aurora.  Initiated and conceptualized by scientists at the University of California at Berkeley, is designed to carry out small, highly focused, scientific investigations.
	    The spacecraft design was tailored to take high-resolution data samples (or "snapshots") only while it crosses the auroral zones, which are latitudinally narrow sectors that encircle the polar regions of the Earth.
	    FAST's primary objective is to study the microphysics of space plasma and the accelerated particles that cause the aurora.
	    FAST was launched on August 21, 1996 into a high inclination (83o) elliptical orbit with apogee and perigee altitudes of 4175 km and 350 km, respectively.
	  </p>
	</div>
      </div>

    </div>

</body>
</html>
