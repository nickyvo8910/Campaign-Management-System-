/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import Entity.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Asus
 */
public class AdminPC {
     private static String sql = "SELECT [EmpID],[EmpType],[EmpName],[EmpAge],[EmpMail]"
            + ",[EmpPhone],[EmpPass] "
            + "FROM [CIS].[dbo].[Employee]"
            ;
    
     //method return a vector contains all Campaign on database
    public static Vector readEmployee() {
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("EmpID"));
                if(rs.getString("EmpType").equals("1")) {
                    temp.add("Admin");
                }else{
                    temp.add("Employee");
                }                
                temp.add(rs.getString("EmpName"));
               
                temp.add(rs.getInt("EmpAge"));
                temp.add(rs.getString("EmpMail"));
                temp.add(rs.getString("EmpPhone"));
                temp.add(rs.getString("EmpPass"));
                                
                
                vt.add(temp);
            }
        }
         catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            return vt;
        }


    }
    
    //method insert new employee to database
        public static String insertEmployee(Employee campaign) {
        Vector vt = readEmployee();
        String mess = "";
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(campaign.getEmloyeeID())) {
                return mess = "Cannot insert duplicate Employee ID ";
            }

        }
        String _sql = "insert into Employee([EmpID],[EmpType],[EmpName],[EmpAge],[EmpMail],[EmpPhone],[EmpPass])"
                + "values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pr = CommonConnection.conn.prepareStatement(_sql);
            pr.setString(1, campaign.getEmloyeeID());
            pr.setBoolean(2, campaign.getEmployeeType());
            pr.setString(3, campaign.getEmployeeName());
            pr.setInt(4, campaign.getAge());
            pr.setString(5, campaign.getEmail());
            pr.setString(6, campaign.getPhone());
            pr.setString(7, campaign.getPassword());

            pr.executeUpdate();
           
            mess = "Insert Successfully";
        } catch (SQLException ex) {
            ex.printStackTrace();
            mess = "Insert Fail";
        } finally {
            return mess;
        }
    }
    //method update Employee

    public static String updateEmployee(Employee campaign) {
        String mess = "";
        String sql2 = "update Employee set EmpName='" + campaign.getEmployeeName()
                + "', EmpType='" + campaign.getEmployeeType()
                + "', EmpAge='" + campaign.getAge()
                + "', EmpMail='" + campaign.getEmail()
                + "', EmpPhone='" + campaign.getPhone()
                + "' where EmpID ='" + campaign.getEmloyeeID()
                + "'";
        Vector vt = readEmployee();
        
        int status = dataPC.execStatement(sql2);
      
        if (status == 0) {
            mess = "Update Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Update sucessfuly !";
        }

        return mess;
    }
    //method change profit
      public static String changeEmployee(Employee campaign) {
        String mess = "";
        String sql2 = "update Employee set EmpName='" + campaign.getEmployeeName()
                
                + "', EmpAge='" + campaign.getAge()
                + "', EmpMail='" + campaign.getEmail()
                + "', EmpPhone='" + campaign.getPhone()
                + "' where EmpID ='" + campaign.getEmloyeeID()
                + "'";
        Vector vt = readEmployee();
        
        int status = dataPC.execStatement(sql2);
      
        if (status == 0) {
            mess = "Update Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Update sucessfuly !";
        }

        return mess;
    }
      //method change Pass
       public static String changePass(Employee campaign) {
        String mess = "";
        String sql2 = "update Employee set EmpPass= '"   + campaign.getPassword()
                
               
                + "' where EmpID ='" + campaign.getEmloyeeID()
                + "'";
        Vector vt = readEmployee();
        
        int status = dataPC.execStatement(sql2);
      
        if (status == 0) {
            mess = "Update Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Update sucessfuly !";
        }

        return mess;
    }
    //method delete Employee by ID
    public static String deleteEmployee(String ID) {
        String mess = "";
        int status = dataPC.execStatement("delete from [CIS].[dbo].[Employee] where EmpID = '" + ID + "'");
        if (status == 0) {
            mess = "Delete Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Delete sucessfuly !";
        }
        return mess;
    }
    //method find Employee by value and type 
    public static Vector FindEmployee(String value, int type) {
        Vector vt = new Vector();
        String sql3 = "";
        if (type == 1) {
            sql3 = "SELECT [EmpID],[EmpType],[EmpName],[EmpAge],[EmpMail]"
            + ",[EmpPhone],[EmpPass]"
            + "FROM [CIS].[dbo].[Employee]"
            + "WHERE EmpID like'%" + value + "%'";
        } else {
              sql3 = "SELECT [EmpID],[EmpType],[EmpName],[EmpAge],[EmpMail]"
            + ",[EmpPhone],[EmpPass]"
            + "FROM [CIS].[dbo].[Employee]"
            + "WHERE  EmpName like'%" + value + "%'";
        }
        ResultSet rs = dataPC.createResultset(sql3);
        try {
            //begin while
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("EmpID"));
                if(rs.getBoolean("EmpType")==true)
                {
                    temp.add("Admin");
                }else{
                    temp.add("Employee");
                }
                
                temp.add(rs.getString("EmpName"));
                
                temp.add(rs.getInt("EmpAge"));
                temp.add(rs.getString("EmpMail"));
                temp.add(rs.getString("EmpPhone"));
                temp.add(rs.getString("EmpPass"));
                
             /*   if (rs.getBoolean("CampEnded") == false) {
                    temp.add("No");
                } else if (rs.getBoolean("CampEnded") == true) {
                    temp.add("Yes");
                }*/
                vt.add(temp);
            }
            //end while
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return vt;
        }
    }
    
}
