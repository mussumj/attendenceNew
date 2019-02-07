/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

//import static attendence.Attendence.con;
import java.sql.Connection;
import java.sql.DriverManager;
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
     
     
     void addStudent(String ID,String Class,String section,String name,String Fname,String fnum,String Aadhar,String address,String photo,Connection con) throws SQLException{
    // Attendence a=new Attendence();
   /*  Scanner scanner = new Scanner(System.in);
     String Id = scanner. nextLine();
     String name = scanner. nextLine();   
     String Class = scanner. nextLine();
     String section = scanner. nextLine(); 
     String Fname = scanner. nextLine();
     String Fnum = scanner. nextLine();
     
     */
     //Statement stmt=a.con.createStatement(); 
         
         
         
     String sql="insert into mystudent.student values (?,?,?,?,?,?,?,?,?)";

     PreparedStatement pst=con.prepareStatement(sql);

     pst.setString(1,ID);
     pst.setString(4,name);
     pst.setString(2,Class);
     pst.setString(3,section);
     pst.setString(5,Fname);
     pst.setString(6,fnum);
     pst.setString(7,Aadhar);
      pst.setString(8,address);
       pst.setString(9,photo);
    pst.executeUpdate();
    System.out.println("row enterd successfully");
    
}}
