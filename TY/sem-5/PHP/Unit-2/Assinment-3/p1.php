<html>
	<head>
		<title>
			Registration Form
		</title>
	</head>
		<body>
			<form action='welcome.php' method='POST'>
			
				<h3 align='center'>Enter Details in Registration Form</h3>
				
					<table align='center' border='1'>
					
							<h5>
							
								<tr>	<td>	Enter  Full Name  </td>  <td> <input type='text' name='full-Name'>     </td></tr>
								
								<tr>	<td>	Enter  Email ID     </td>  <td><input type='text' name='email'>		 </td> </tr>
								
								<tr>	<td>	Enter  Password    </td>  <td> <input type='password' name='Password'>   </td></tr>
								
								<tr> 
									<td> Choose Gender </td>
									
												<td> 
													<input type='radio' name='gender' value='male'> Male 
													<input type='radio' name='gender' value='female'> Female
												</td> 
								</tr>
								
								<tr> 
									<td> Choose Hobies</td>
									
												<td> <input type='checkbox' name='hoby[]' value='reading'> Reading 
												     <input type='checkbox' name='hoby[]' value='sports'> Sports 
													 <input type='checkbox' name='hoby[]' value='music'> Music 
												</td> 
								</tr>
								
								<tr>	
									<td>	Enter Address  </td>  
										<td> 
																   <textarea rows='5' cols='50' name='addres'></textarea> 
										</td>
								</tr>
								
								<tr>
									<td> Select Youre City </td>
									<td>
										<select name='dropdown'>
											<option value='Botad' selectd>  Botad </option>
											<option value='Ahemdabad' selectd>  Ahemdabad </option>
											<option value='Gandhinagar' selectd>  Gandhinagar </option>
										</select>
									</td>
								</tr>
								
								<tr>
									<td> Select option </td>
									
										<td>
											<input type='submit' name='submit' value='Register'>
											<input type='reset' name='reset' value='RESET'>
										</td>
								</tr>
								
							</h5>
							
					</table>
			</form>
		</body>
</html>