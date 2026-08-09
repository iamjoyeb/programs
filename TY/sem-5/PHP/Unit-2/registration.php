<html>
	<head>
		<title>
			Registration Form
		</title>
	</head>
		<body>
			<form method='POST'>
				<h3 align='center'>Enter Details in Registration Form</h3>
					<table align='center' border='1'>
							<h5>
								<tr>	<td>	Enter  First Name  </td>  <td> <input type='text' name='First-Name'>     </td></tr>
								
								<tr>	<td>	Enter  Second Name </td>  <td> <input type='text' name='Second-Name'>    </td></tr>
								
								<tr>	<td>	Enter  User ID     </td>  <td><input type='text' name='user-id'>		 </td> </tr>
								
								<tr>	<td>	Enter  Password    </td>  <td> <input type='password' name='Password'>   </td></tr>
								
								<tr>	
									<td>	Enter Description  </td>  
										<td> 
																   <textarea rows='5' cols='50' name='Description'>
																					Enter Description
																   </textarea> 
										</td>
								</tr>
								<tr> 
									<td> Choose Subject </td>
									
												<td> <input type='checkbox' name='se' value='on'> Software Enginering 
												     <input type='checkbox' name='java' value='on'> JAVA 
													 <input type='checkbox' name='dtb' value='on'> ORACLE 
												</td> 
								</tr>
																	
								<tr> 
									<td> Choose Gender </td>
									
												<td> 
													<input type='radio' name='gender' value='male'> Male 
													<input type='radio' name='gender' value='female'> Female
												</td> 
								</tr>
								
								<tr>
									<td> Select Youre Class </td>
									<td>
										<select name='dropdown'>
											<option value='Class A' selectd> Class A </option>
											<option value='Class B' selectd> Class B </option>
											<option value='Class C' selectd> Class C </option>
										</select>
									</td>
								</tr>
								
								<tr>
									<td> Select option </td>
									
										<td>
											<input type='submit' name='submit' value='SUBMIT'>
											<input type='reset' name='reset' value='RESET'>
										</td>
								</tr>
							</h5>
					</table>
			</form>
			
			<?php 
				if(isset($_POST['submit'])){
					echo "working";
				}
			?>
		</body>
</html>