/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;

/**
 *
 * @author Morris Mano
 */
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
 
public class CRenderer extends DefaultTableCellRenderer{
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
         boolean hasFocus, int row, int column)
     {
 
        
        JLabel label = new javax.swing.JLabel();
            //you can add the image here
            label.setIcon(new ImageIcon(getClass().getResource("icon8-invisible-20.png")));
            label.setOpaque(true);
            return label;
        
 
        //else
        //    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
 
     }
}
