/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author mannan impax
 */
public class AddStudent {
     
     
     void addStudent() throws SQLException{
     Attendence a=new Attendence();
     Scanner scanner = new Scanner(System.in);
     String Id = scanner. nextLine();
     String name = scanner. nextLine();   
     String Class = scanner. nextLine();
     String section = scanner. nextLine(); 
     String Fname = scanner. nextLine();
     String Fnum = scanner. nextLine();
     
     
     //Statement stmt=a.con.createStatement(); 
         
         
         
     String sql="insert into mysql2.student values (?,?,?,?,?,?)";

     PreparedStatement pst=a.con.prepareStatement(sql);

     pst.setString(1,Id);
     pst.setString(2,name);
     pst.setString(3,Class);
     pst.setString(4,section);
     pst.setString(5,Fname);
     pst.setString(6,Fnum);
     
    pst.executeUpdate();
    System.out.println("row enterd successfully");
    
}}
