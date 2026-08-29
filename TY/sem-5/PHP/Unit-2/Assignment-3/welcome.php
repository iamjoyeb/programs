<?php 
	if(isset($_POST['submit'])){
		$fname=$_POST['full-Name'];
		$email=$_POST['email'];
		$password=$_POST['Password'];
		$gen=$_POST['gender'];
		$hobby=implode(",",$_POST['hoby']);
		$addr=$_POST['addres'];
		$city=$_POST['dropdown'];
					
		
					
		echo "
			<table align='center' border='1'> 
				<tr>
					<td> Full Name is </td>
						<td> $fname </td>
				</tr> 
				
				<tr>
					<td> Email id is </td>
						<td> $email </td>
				</tr>
				
				<tr>
					<td> Password is </td>
						<td> $password </td>
				</tr>
				
				<tr>
					<td> Gender is </td>
						<td> $gen </td>
				</tr>
				
				<tr>
					<td> Hobbies  is </td>
						<td> $hobby </td>
				</tr>  
				
				<tr>
					<td> Address is </td>
						<td> $addr </td>
				</tr> 
				
				<tr>
					<td> City is </td>
						<td> $city </td>
				</tr>  
				
			</table>";
	}
?>