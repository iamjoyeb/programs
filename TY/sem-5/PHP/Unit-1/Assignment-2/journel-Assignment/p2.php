<!-- Q2. Write a PHP script to demonstrate an associative array and display its elements using foreach loop. -->
<html>
	<head>
	</head>
	<body>
		<h3>Associative Array with Foreach Loop</h3>
		<?php
			$student=array(
				"Name"=>"Rahul",
				"RollNo"=>101,
				"Class"=>"TY",
				"Branch"=>"CS",
				"City"=>"Mumbai",
				"State"=>"Maharashtra",
				"Pin"=>400001,
				"Phone"=>9876543210,
				"Email"=>"rahul@example.com",
				"Grade"=>"A"
			);

			echo "<b>Student Details:</b><br><br>";
			foreach($student as $key=>$value){
				echo $key." : ".$value."<br>";
			}
		?>
	</body>
</html>

<!--
Output:
Student Details:

Name : Rahul
RollNo : 101
Class : TY
Branch : CS
City : Mumbai
State : Maharashtra
Pin : 400001
Phone : 9876543210
Email : rahul@example.com
Grade : A
-->
