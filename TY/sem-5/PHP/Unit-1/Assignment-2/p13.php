<html>
	<head>
	</head>
	<body>
		<form method="POST">
			<h3>Area of Rectangle</h3>
			Length: <input type="text" name="length"><br><br>
			Width: <input type="text" name="width"><br><br>
			<input type="submit" name="calculate" value="Calculate Area">
		</form>

		<?php
			if(isset($_POST['calculate'])){
				$length=$_POST['length'];
				$width=$_POST['width'];
				$area=$length*$width;

				echo "<br><b>Length:</b> ".$length."<br>";
				echo "<b>Width:</b> ".$width."<br>";
				echo "<b>Area of Rectangle:</b> ".$area."<br>";
			}
		?>
	</body>
</html>

<!--
Output:
Length: 8
Width: 5

Length: 8
Width: 5
Area of Rectangle: 40
-->
