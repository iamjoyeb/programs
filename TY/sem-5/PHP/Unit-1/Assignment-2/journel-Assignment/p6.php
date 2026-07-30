<!-- Q6. Write a PHP script to perform multiplication of two 3x3 matrices and display the result. -->
<html>
	<head>
	</head>
	<body>
		<h3>Multiplication of Two 3x3 Arrays</h3>
		<?php
			$a=array(
				array(1,2,3),
				array(4,5,6),
				array(7,8,9)
			);

			$b=array(
				array(1,0,0),
				array(0,1,0),
				array(0,0,1)
			);

			echo "<b>Array A:</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo $a[$i][$j]." ";
				}
				echo "<br>";
			}

			echo "<br><b>Array B (Identity Matrix):</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo $b[$i][$j]." ";
				}
				echo "<br>";
			}

			$result=array();
			for($i=0;$i<3;$i++){
				$result[$i]=array();
				for($j=0;$j<3;$j++){
					$result[$i][$j]=0;
					for($k=0;$k<3;$k++){
						$result[$i][$j]+=$a[$i][$k]*$b[$k][$j];
					}
				}
			}

			echo "<br><b>Result (A x B):</b><br>";
			for($i=0;$i<3;$i++){
				for($j=0;$j<3;$j++){
					echo $result[$i][$j]." ";
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

Array B (Identity Matrix):
1 0 0
0 1 0
0 0 1

Result (A x B):
1 2 3
4 5 6
7 8 9
-->
