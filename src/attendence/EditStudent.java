          /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author mannan impax
 */
public class EditStudent {
    void editstudent() throws SQLException
    {
     Attendence a=new Attendence();
     Scanner scanner = new Scanner(System.in);
     String Id = scanner. nextLine();
     String name = scanner. nextLine();   
     String Fname = scanner. nextLine();
     String Fnum = scanner. nextLine();
     String Class = scanner. nextLine();
     String section = scanner. nextLine(); 
     String sql="update mysql2.student set name=?,class=? where Id=? OR name=? ;";

     PreparedStatement pst=a.con.prepareStatement(sql);
      pst.setString(1,name);
       pst.setString(2,Class);
        pst.setString(3,Id);
         pst.setString(4,name);
          pst.execute();
    System.out.println("row edited successfully");
       
     
    }
    
}
