<!-- Q10. Write a PHP script to display current script and server information using $_SERVER. -->
<html>
	<head>
	</head>
	<body>
		<h3>Current Script and Server Information</h3>
		<?php
			echo "<b>Script Name:</b> ".__FILE__."<br>";
			echo "<b>Server Name:</b> ".$_SERVER['SERVER_NAME']."<br>";
			echo "<b>Server Software:</b> ".$_SERVER['SERVER_SOFTWARE']."<br>";
			echo "<b>Server Protocol:</b> ".$_SERVER['SERVER_PROTOCOL']."<br>";
			echo "<b>Request Method:</b> ".$_SERVER['REQUEST_METHOD']."<br>";
			echo "<b>Script Filename:</b> ".$_SERVER['SCRIPT_FILENAME']."<br>";
			echo "<b>Document Root:</b> ".$_SERVER['DOCUMENT_ROOT']."<br>";
		?>
	</body>
</html>

<!--
Output:
Script Name: C:/xampp/htdocs/programs/p10.php
Server Name: localhost
Server Software: Apache/2.4.54 (Win64)
Server Protocol: HTTP/1.1
Request Method: GET
Script Filename: C:/xampp/htdocs/programs/p10.php
Document Root: C:/xampp/htdocs
-->
