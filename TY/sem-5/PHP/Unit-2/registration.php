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
                                                                <tr>    <td>    Enter  First Name  </td>  <td> <input type='text' name='First-Name'>     </td></tr>

                                                                <tr>    <td>    Enter  Second Name </td>  <td> <input type='text' name='Second-Name'>    </td></tr>

                                                                <tr>    <td>    Enter  User ID     </td>  <td><input type='text' name='user-id'>                 </td> </tr>

                                                                <tr>    <td>    Enter  Password    </td>  <td> <input type='password' name='Password'>   </td></tr>

                                                                <tr>
                                                                        <td>    Enter Description  </td>  
                                                                                <td> 
                                                                                                                                   <textarea rows='5' cols='50' name='Description'>
                                                                                                                                                                      Enter Description
                                                                                                                                   </textarea> 
                                                                                </td>
                                                                </tr>
                                                                <tr> 
                                                                        <td> Choose Subject </td>

                                                                                                <td> <input type='checkbox' name='sub[]' value='Software Enginering '> Software Enginering 
                                                                                                     <input type='checkbox' name='sub[]' value='JAVA'> JAVA 
                                                                                                         <input type='checkbox' name='sub[]' value='ORACLE'> ORACLE 
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
                                                                                        <option value='Class A' selected>  A </option>
                                                                                        <option value='Class B'>  B </option>
                                                                                        <option value='Class C'>  C </option>
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

                                                        $fname=$_POST['First-Name'];
                                                        $sname=$_POST['Second-Name'];
                                                        $uid=$_POST['user-id'];
                                                        $password=$_POST['Password'];
                                                        $description=$_POST['Description'];

                                                        if(isset($_POST['sub'])){
                                                                $sub=implode(",",$_POST['sub']);
                                                        }
                                                        else{
                                                                $sub="None";
                                                        }

                                                        $gen=$_POST['gender'];
                                                        $sclass=$_POST['dropdown'];

                                                        echo "First Name is:".$fname."<br>";
                                                        echo "Second Name is".$sname."<br>";
                                                        echo "User ID is".$uid."<br>";
                                                        echo "Pasword is".$password."<br>";
                                                        echo "description is".$description."<br>";
                                                        echo "Subject is: ".$sub."<br>";
                                                        echo "Gender is: ".$gen."<br>";
                                                        echo "Class  is: ".$sclass."<br>";
                                                }
                                        ?>
                </body>
</html>