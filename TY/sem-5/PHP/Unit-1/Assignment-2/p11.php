<html>
	<head>
	</head>
	<body>
		<form method="POST">
			<h3>Reverse a String (without strrev)</h3>
			Enter String: <input type="text" name="str"><br><br>
			<input type="submit" name="reverse" value="Reverse">
		</form>

		<?php
			if(isset($_POST['reverse'])){
				$str=$_POST['str'];
				$reversed="";
				$len=strlen($str);

				for($i=$len-1;$i>=0;$i--){
					$reversed.=$str[$i];
				}

				echo "<br><b>Original String:</b> ".$str."<br>";
				echo "<b>Reversed String:</b> ".$reversed."<br>";
			}
		?>
	</body>
</html>

<!--
Output:
Enter String: Hello

Original String: Hello
Reversed String: olleH
-->
