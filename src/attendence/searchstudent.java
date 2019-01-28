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
import java.util.*;
public class searchstudent {
    Attendence a=new Attendence();
    void searchMethod() throws SQLException{
     Scanner scanner = new Scanner(System.in);
     String input = scanner. nextLine();
     String sql="select * from  mysql2.student where Id=? ";
PreparedStatement pst=a.con.prepareStatement(sql);
pst.setString(1,input);
ResultSet rs=pst.executeQuery();
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
     
}
}
