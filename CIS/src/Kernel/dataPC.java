/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author NickyVo
 */
public class dataPC {
    static String message = "";
    //Databse query
    public static PreparedStatement ps;
    public static ResultSet rs=null;
     //method execute sql query and return resultset
    public static ResultSet createResultset(String sql) {
        
        try {            
            ps = CommonConnection.conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = ps.executeQuery();          
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return rs;
        }
    }
    
    //method execute sql query
    public static int execStatement(String sql) {
        int flag = 0;

        try {
            PreparedStatement ps2 = CommonConnection.conn.prepareStatement(sql);
            flag=ps2.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return flag;
        }
    }
    
    //method return string values from another field
    public static String getAnotherField(String Table, String AvailableColumn, String WantedColumn, String Value) {
        String _sql = "select * from " + Table;
        String FieldName = "";
        ResultSet rs = dataPC.createResultset(_sql);
        try {
            while (rs.next()) {
                if (Value.equals(rs.getString(AvailableColumn))) {
                    FieldName = rs.getString(WantedColumn);
                    break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return FieldName;
        }
    }
        
     //method read data to combobox
    public static void readToComboBox(String table, JComboBox combo, String column) {
        String _sql = "select * from " + table;
        try {
            ResultSet rs = createResultset(_sql);
            while (rs.next()) {
                String item = rs.getString(column);
                combo.addItem(item);

                message = "Read to combo box successfully";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            message = "Read to combo box fail";
        } 
    }
}


