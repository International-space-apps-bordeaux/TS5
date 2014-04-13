<?php
$baseUrl = "";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Follow Sat</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <link href="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/css/layout.css" rel="stylesheet" media="screen">

        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBYOgoKO_QD7cFxGwfqenxkch9SZlU59bU&sensor=false"></script>
        <script src="http://<?php echo $_SERVER['SERVER_NAME']."/".$baseUrl; ?>FollowSat/client/js/tracker.js"></script>
</head>
<body>
    
    <div id="container">

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
              <li data-idsat="fast" data-way="0"><p>Fast</p></li>
              <li data-idsat="iss" data-way="1"><p>ISS</p></li>
              <li data-idsat="aim" data-way="0"><p>AIM</p></li>
            <li data-idsat="fast" data-way="0"><p>Fast</p></li>
            </ul>
	  </div>
	</div>
      </div>
      <div id="document">
	<p>
	  The International Space Station (ISS) is a space station, or a habitable artificial satellite in low Earth orbit. It is a modular structure whose first component was launched in 1998.[7] Now the largest artificial body in orbit, it can often be seen at the appropriate time with the naked eye from Earth.[8] The ISS consists of pressurised modules, external trusses, solar arrays and other components. ISS components have been launched by American Space Shuttles as well as Russian Proton and Soyuz rockets.[9] In 1984 the ESA was invited to participate in Space Station Freedom.[10] In 1993, after the USSR ended, the United States and Russia merged Mir-2 and Freedom together.[9]

The ISS serves as a microgravity and space environment research laboratory in which crew members conduct experiments in biology, human biology, physics, astronomy, meteorology and other fields.[11][12][13] The station is suited for the testing of spacecraft systems and equipment required for missions to the Moon and Mars.[14]

Since the arrival of Expedition 1 on 2 November 2000, the station has been continuously occupied for 13 years and 162 days, the longest continuous human presence in space. (In 2010, the station surpassed the previous record of almost 10 years (or 3,634 days) held by Mir.) The station is serviced by a variety of visiting spacecraft: Soyuz, Progress, the Automated Transfer Vehicle, the H-II Transfer Vehicle,[15] Dragon, and Cygnus. It has been visited by astronauts and cosmonauts from 15 different nations.[16]

After the U.S. Space Shuttle program ended in 2011, Soyuz rockets became the only provider of transport for astronauts at the International Space Station, while Dragon became the only provider of cargo-return-to-Earth services.

The ISS programme is a joint project among five participating space agencies: NASA, Roskosmos, JAXA, ESA, and CSA.[15][17] The ownership and use of the space station is established by intergovernmental treaties and agreements.[18] The station is divided into two sections, the Russian Orbital Segment (ROS) and the United States Orbital Segment (USOS), which is shared by many nations. The ISS maintains an orbit with an altitude of between 330 km (205 mi) and 435 km (270 mi) by means of reboost manoeuvres using the engines of the Zvezda module or visiting spacecraft. It completes 15.50 orbits per day.[19] The ISS is funded until 2024, and may operate until 2028.[20][21][22] The Russian Federal Space Agency, Roskosmos (RKA) has proposed using the ISS to commission modules for a new space station, called OPSEK, before the remainder of the ISS is deorbited. ISS is the ninth space station to be inhabited by crews, following the Soviet and later Russian Salyut, Almaz, and Mir stations, and Skylab from the US.
	</p>
      </div>

    </div>

</body>
</html>
