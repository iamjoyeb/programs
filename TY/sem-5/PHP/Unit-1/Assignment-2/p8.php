<html>
	<head>
	</head>
	<body>
		<h3>Addition of Two 3x3 Arrays</h3>
		<?php
			$a=array(
				array(1,2,3),
				array(4,5,6),
				array(7,8,9)
			);

			$b=array(
				array(9,8,7),
				array(6,5,4),
				array(3,2,1)
			);

			echo "<b>Array A:</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo $a[$i][$j]." ";
				}
				echo "<br>";
			}

			echo "<br><b>Array B:</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo $b[$i][$j]." ";
				}
				echo "<br>";
			}

			echo "<br><b>Result (A + B):</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo ($a[$i][$j]+$b[$i][$j])." ";
				}
				echo "<br>";
			}
		?>
	</body>
</html>

<!--
Output:
Array A:
1 2 3
4 5 6
7 8 9

Array B:
9 8 7
6 5 4
3 2 1

Result (A + B):
10 10 10
10 10 10
10 10 10
-->
