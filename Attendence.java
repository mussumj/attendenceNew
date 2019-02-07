/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

/**
 *
 * @author mannan impax
 */
import java.sql.*;  
class Attendence{ 
    public static Connection con;
public static void main(String args[]){  
    searchstudent s= new searchstudent();
    AddStudent add=new AddStudent();
    EditStudent edit=new EditStudent();
try{  
Class.forName("com.mysql.jdbc.Driver");  
 con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/mystudent","musarrat","jinglebell25");  
String ste="select name,class,section,address,fname from mystudent.student";
PreparedStatement pst=con.prepareStatement(ste);
ResultSet rs=pst.executeQuery();
while(rs.next())
{
    System.out.println(rs.getString("name"));
}
//s.searchMethod();
//add.addStudent();
//edit.editstudent();
 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  