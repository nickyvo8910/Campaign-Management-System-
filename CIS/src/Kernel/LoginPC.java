/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author NickyVo
 */
public class LoginPC {
    // Read User Information to a vector, use to check when an user gets login
    public static Vector readEmployee() {
        String sql = "select EmpID, EmpName, EmpType, EmpPass From Employee";
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("EmpID"));
                temp.add(rs.getString("EmpName"));
                temp.add(rs.getString("EmpType"));
                temp.add(rs.getString("EmpPass"));


                vt.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return vt;
        }
    }

    // Return a vector with all information of Users
    public static Vector getEmployeeInformation() {
        String sql = "Select EmpID,[EmpType],[EmpName],[EmpAge],[EmpMail],[EmpPhone],[EmpPass] From [CIS].[dbo].[Employee]";
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("EmpId"));
                temp.add(rs.getString("EmpType"));
                temp.add(rs.getString("EmpName"));
                temp.add(rs.getString("EmpAge"));
                temp.add(rs.getString("EmpMail"));
                temp.add(rs.getString("EmpPhone"));
                temp.add(rs.getString("EmpPass"));
                
                vt.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return vt;
        }
    }
}
