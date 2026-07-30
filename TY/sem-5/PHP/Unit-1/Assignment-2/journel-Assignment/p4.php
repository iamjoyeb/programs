<!-- Q4. Write a PHP script to demonstrate the use of continue statement in a for loop. -->
<html>
	<head>
	</head>
	<body>
		<h3>Continue Statement Example</h3>
		<?php
			for($i=1;$i<=10;$i++){
				if($i==5){
					echo "Skipping number 5 (continue executed)<br>";
					continue;
				}
				echo $i."<br>";
			}
		?>
	</body>
</html>

<!--
Output:
1
2
3
4
Skipping number 5 (continue executed)
6
7
8
9
10
-->
