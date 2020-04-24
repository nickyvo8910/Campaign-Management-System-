/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import Entity.Advertisement;
import Entity.Campaign;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author TrinhNguyen
 */
public class AdPC {
     private static String sql = "SELECT * FROM [CIS].[dbo].[Advertisement]";
     
     public static Vector readAdvertisement() {
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("AdID"));
                temp.add(rs.getString("AdType"));
                temp.add(rs.getString("AdPrice"));
                temp.add(rs.getString("AdPartner"));
                temp.add(rs.getString("AdDes"));
               
                
                vt.add(temp);
            }
        }
         catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            return vt;
        }
     }
         //method insert new advertisement to database
      public static String insertAdvertisement(Advertisement ad) {
        Vector vt = readAdvertisement();
        String mess = "";
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(ad.getAdvertisementID())) {
                return mess = "Cannot insert duplicate advertisement ";
            }

        }
        String _sql = "insert into Advertisement([AdID],[AdType],[AdPrice],[AdPartner],[AdDes])"
               
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pr = CommonConnection.conn.prepareStatement(_sql);
            pr.setString(1, ad.getAdvertisementID());
            pr.setString(2, ad.getAdType());
            pr.setFloat(3, ad.getAdPrice()); 
            pr.setString(4, ad.getAdPartner());
            pr.setString(5,ad.getDescription());
            
            pr.executeUpdate();
            
           mess = "Insert Successfully";
        } catch (SQLException ex) {
            ex.printStackTrace();
            mess = "Insert Fail";
        } finally {
            return mess;
        }
    }
       //method update campaign

   public static String updateAdvertisement(Advertisement ad) {
        String mess = "";
        String sql2 = "update Advertisement set AdType='" + ad.getAdType()
                 + "', AdPrice='" + ad.getAdPrice()
                 + "', AdPartner='" + ad.getAdPrice()
                 + "', AdDes='" + ad.getDescription()
                + "' where AdID like'" + ad.getAdvertisementID()
                + "'";
        Vector vt = readAdvertisement();
        String adID = dataPC.getAnotherField("Advertisement", "AdID", "AdType",(ad.getAdvertisementID()));
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(ad.getAdType()) && !temp.get(1).toString().equals(adID)) {
                return mess = "Cannot update duplicate advertisement type ";
            }

        }
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
          //method delete advertisement to database
        public static String deleteAdvertisement(String ID) {
        String mess = "";
        int flag1 = dataPC.execStatement("delete from Campaign where AdID = '" + ID + "'");
        int status = dataPC.execStatement("delete from Advertisement where AdID = '" + ID + "'");
        if (status == 0) {
            mess = "Delete Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Delete sucessfuly !";
        }
        return mess;
    }
    public static Vector FindAdvertisement(String value, int type) {
        Vector vt = new Vector();
        String sql3 = "";
        if (type == 1) {
            sql3 = "SELECT [AdID],[AdType],[AdPrice],[AdPartner],[AdDes]"
            + "FROM [CIS].[dbo].[Advertisement]"
            + "WHERE AdID like'%" + value + "%'";
        } else {
            sql3 = "SELECT [AdID],[AdType],[AdPrice],[AdPartner],[AdDes]"
            + "FROM [CIS].[dbo].[Advertisement]"
            + "WHERE AdType like'%" + value + "%'";
        }
        ResultSet rs = dataPC.createResultset(sql3);
        try {
            //begin while
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("AdID"));
                temp.add(rs.getString("AdType"));
                temp.add(rs.getString("AdPrice"));
                temp.add(rs.getString("AdPartner"));
                temp.add(rs.getString("AdDes"));
                
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
