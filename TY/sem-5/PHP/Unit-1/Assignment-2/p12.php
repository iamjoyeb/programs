<html>
	<head>
	</head>
	<body>
		<form method="POST">
			<h3>Area of Triangle</h3>
			Base: <input type="text" name="base"><br><br>
			Height: <input type="text" name="height"><br><br>
			<input type="submit" name="calculate" value="Calculate Area">
		</form>

		<?php
			if(isset($_POST['calculate'])){
				$base=$_POST['base'];
				$height=$_POST['height'];
				$area=($base*$height)/2;

				echo "<br><b>Base:</b> ".$base."<br>";
				echo "<b>Height:</b> ".$height."<br>";
				echo "<b>Area of Triangle:</b> ".$area."<br>";
			}
		?>
	</body>
</html>

<!--
Output:
Base: 10
Height: 5

Base: 10
Height: 5
Area of Triangle: 25
-->
