/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

import static attendence.Attendence.con;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import attendence.CRenderer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
/**
 *
 * @author Morris Mano
 */
public class viewgui extends javax.swing.JFrame {

    /**
     * Creates new form viewgui
     */
   // String[]classlist={};
   static DefaultComboBoxModel<String>ar=new DefaultComboBoxModel<String>();
    
   JLabel jLabel2;
    int count=1;
  //  private Object jLable2;
    public viewgui() {
        initComponents();
//        jTable1.setDefaultRenderer(JLabel.class,  new Renderer());
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Class", "Section", "Father Name", "Edit/View", "   Delete", "Present"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "A1", "B1", "B2" }));

        save.setText("SAVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(save))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
         jTable1.setRowHeight(30);
         jLabel2 = new javax.swing.JLabel();
         jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendence/icons8-invisible-20.png"))); try{
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            String s=null;
            PreparedStatement pst=null;
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/mystudent","musarrat","jinglebell25");  
           // System.out.println(jComboBox1.getSelectedIndex());
             
            String dropclass= (String) jComboBox1.getSelectedItem();
            String dropsec=(String)jComboBox2.getSelectedItem();
            System.out.println(dropclass);
            if(!(dropclass.equals('0')))
            {  System.out.println("here");
                s="select name,class,section,address,fname from mystudent.student where class=? AND section=?";
               pst=con.prepareStatement(s);
                pst.setString(1, dropclass);
                pst.setString(2,dropsec);
            }
            else
            { s="select name,class,section,address,fname from mystudent.student";
            pst=con.prepareStatement(s);}
            ResultSet rs=pst.executeQuery();
            tm.setRowCount(0);
        while(rs.next())
    
        {
             System.out.println(rs.getString("name")+rs.getString("class")+rs.getString("section")+rs.getString("address")+rs.getString("fname"));
             Object o[]={count,rs.getString("name"),rs.getString("class"),rs.getString("section"),rs.getString("address"),rs.getString("fname")};
             tm.addRow(o);
             count=count+1;
    
        }
        jTable1.getColumn("Edit/View").setCellRenderer(new LabelRender());
        jTable1.getColumn("   Delete").setCellRenderer(new LabelRender1());
       //  jTable1.getColumn("Add/Edit/view").setCellRenderer(new LabelRender());
        }
        catch(Exception e)
        {System.out.println(e);}
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       Point p= evt.getPoint();
      
    //  Component c= jTable1.getComponentAt(p);
     JTable j= (JTable) evt.getSource();
     System.out.println("table column"+" "+j.getSelectedColumn());
      System.out.println("table column"+" "+j.getRowCount());
  
  
   //   c.setBackground(Color.red);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        jComboBox1.setModel(ar);
        System.out.println(ar);
           
    }//GEN-LAST:event_jComboBox1MouseClicked
 void upDateClass(){
    try {
           // TODO add your handling code here:
           
           Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/mystudent","musarrat","jinglebell25");  
            String s="select distinct studentclass from mystudent.studentclasses";
            PreparedStatement pst=con.prepareStatement(s);
            ResultSet rs=pst.executeQuery(); 
          
           
            // jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"No Class" }));
           //   jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(classlist));
              jComboBox1.setModel(ar);
            while (rs.next())
            {System.out.println(rs.getString("studentclass")); 
               // jComboBox1.addItem(rs.getString("studentclass"));
               ar.addElement(rs.getString("studentclass"));
            }
            
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(viewgui.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(viewgui.class.getName()).log(Level.SEVERE, null, ex);
       }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
ar.addElement("No class");
viewgui obj=new viewgui();
obj.upDateClass();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewgui().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
class LabelRender implements TableCellRenderer {



    private JLabel label;
    private JLabel label2;
    private ImageIcon icon;
 private ImageIcon icon1;

    public LabelRender()

    {
        icon=new ImageIcon(getClass().getResource("/attendence/icons8-invisible-20.png"));
        icon1=new ImageIcon(getClass().getResource("/attendence/pencil-20.png"));
        label = new JLabel();
        label2=new JLabel();

    }



    public Component getTableCellRendererComponent (

            JTable table, Object value, boolean isSelected,

            boolean hasFocus, final int row, final int column)

        {
            JPanel panel = new JPanel();
            
        label.setIcon(icon);
        label2.setIcon(icon1);
        
        panel.add(label);
           panel.add(label2);
          // System.out.println( panel.getComponentCount());
         //  panel.addMouseListener(new MouseListen());
      
         //System.out.println("hiiii");
            return panel;
    }

}
class LabelRender1 implements TableCellRenderer {



    private JLabel label;
    private JLabel label2;
    private ImageIcon icon;
 private ImageIcon icon1;

    public LabelRender1()

    {
        icon=new ImageIcon(getClass().getResource("/attendence/icons8-trash-20.png"));
       // icon1=new ImageIcon(getClass().getResource("/attendence/pencil-20.png"));
        label = new JLabel();
        label2=new JLabel();

    }



    public Component getTableCellRendererComponent (

            JTable table, Object value, boolean isSelected,

            boolean hasFocus, final int row, final int column)

        {
            JPanel panel = new JPanel();
            
        label.setIcon(icon);
        //label2.setIcon(icon1);
        
        panel.add(label);
         //  panel.add(label2);
          // System.out.println( panel.getComponentCount());
         //  panel.addMouseListener(new MouseListen());
      
         System.out.println("hiiii");
            return panel;
    }

}
