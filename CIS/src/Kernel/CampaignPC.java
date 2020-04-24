/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import Entity.Campaign;
import GUI.CampaignMaster;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author NickyVo
 */
public class CampaignPC {
    private static String sql = "SELECT [CampID],[CampName],[ProID],[StartDate],[EndDate]"
            + ",[Period],[Campaign].[AdID],[Advertisement].[AdType],[CampDes],[CampEnded] "
            + "FROM [CIS].[dbo].[Campaign],[CIS].[dbo].[Advertisement]"
            + "WHERE [Campaign].[AdID] = [Advertisement].[AdID]";
    
     //method return a vector contains all Campaign on database
    public static Vector readCampaign() {
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                temp.add(rs.getString("ProID"));
                temp.add(Validation.convertDateToString(rs.getDate("StartDate")));
                temp.add(Validation.convertDateToString(rs.getDate("EndDate")));
                temp.add(rs.getString("Period"));
                temp.add(rs.getString("AdID"));
                temp.add(rs.getString("AdType"));
                temp.add(rs.getString("CampDes"));
                                
                if (rs.getBoolean("CampEnded") == false) {
                    temp.add("No");
                } else if (rs.getBoolean("CampEnded") == true) {
                    temp.add("Yes");
                }
                vt.add(temp);
            }
        }
         catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            return vt;
        }


    }
    
    //method insert new campaign to database
        public static String insertCampaign(Campaign campaign) {
        Vector vt = readCampaign();
        String mess = "";
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(campaign.getCampaignName())) {
                return mess = "Cannot insert duplicate campaign ";
            }

        }
        String _sql = "insert into Campaign([CampName],[ProID],[StartDate],[EndDate]"
                + ",[AdID],[CampDes],[CampEnded]) "
                + "values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pr = CommonConnection.conn.prepareStatement(_sql);
            pr.setString(1, campaign.getCampaignName());
            pr.setString(2, campaign.getProductId());
            pr.setDate(3, campaign.getStartDate());
            pr.setDate(4, campaign.getEndDate());
            pr.setString(5, campaign.getAdID());
            pr.setString(6, campaign.getDescription());
            pr.setBoolean(7, campaign.getEnded());
            
            pr.executeUpdate();
            dataPC.execStatement("update [CIS].[dbo].[Campaign] set Period = datediff(day, StartDate, EndDate)");
            mess = "Insert Successfully";
        } catch (SQLException ex) {
            ex.printStackTrace();
            mess = "Insert Fail";
        } finally {
            return mess;
        }
    }
    //method update campaign

    public static String updateCampaign(Campaign campaign) {
        String mess = "";
        String sql2 = "update Campaign set CampName='" + campaign.getCampaignName()
                + "', ProID='" + campaign.getProductId()
                + "', StartDate='" + campaign.getStartDate()
                + "', EndDate='" + campaign.getEndDate()
                + "', AdID='" + campaign.getAdID()
                + "', CampDes='" + campaign.getDescription()
                + "', CampEnded='" + campaign.getEnded()
                + "' where CampID ='" + campaign.getCampaignID()
                + "'";
        Vector vt = readCampaign();
        String camID = String.valueOf(campaign.getCampaignID());
        System.out.println("CAMPID :"+camID);
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(campaign.getCampaignName()) && !temp.get(0).toString().equals(camID)) {
                return mess = "Cannot update duplicate campaign name ";
            }

        }
        int status = dataPC.execStatement(sql2);
        dataPC.execStatement("update [CIS].[dbo].[Campaign] set Period = datediff(day, StartDate, EndDate)");
        if (status == 0) {
            mess = "Update Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Update sucessfuly !";
        }

        return mess;
    }
    //method delete campaign by ID
    public static String deleteCampaign(String ID) {
        String mess = "";
        int status = dataPC.execStatement("delete from [CIS].[dbo].[Campaign] where CampID = '" + ID + "'");
        if (status == 0) {
            mess = "Delete Failure ";
        } else if (status == -1) {
            mess = "SQL server exception ";
        } else {
            mess = "Delete sucessfuly !";
        }
        return mess;
    }
    //method find campaign by value and type 
    public static Vector FindCampaign(String value, int type) {
        Vector vt = new Vector();
        String sql3 = "";
        if (type == 1) {
            sql3 = "SELECT [CampID],[CampName],[ProID],[StartDate],[EndDate]"
            + ",[Period],[Campaign].[AdID],[Advertisement].[AdType],[CampDes],[CampEnded] "
            + "FROM [CIS].[dbo].[Campaign],[CIS].[dbo].[Advertisement]"
            + "WHERE [Campaign].[AdID] = [Advertisement].[AdID] and CampID like'%" + value + "%'";
        } else {
            sql3 = "SELECT [CampID],[CampName],[ProID],[StartDate],[EndDate]"
            + ",[Period],[Campaign].[AdID],[Advertisement].[AdType],[CampDes],[CampEnded] "
            + "FROM [CIS].[dbo].[Campaign],[CIS].[dbo].[Advertisement]"
            + "WHERE [Campaign].[AdID] = [Advertisement].[AdID] and CampName like'%" + value + "%'";
        }
        ResultSet rs = dataPC.createResultset(sql3);
        try {
            //begin while
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                temp.add(rs.getString("ProID"));
                temp.add(Validation.convertDateToString(rs.getDate("StartDate")));
                temp.add(Validation.convertDateToString(rs.getDate("EndDate")));
                temp.add(rs.getString("Period"));
                temp.add(rs.getString("AdID"));
                temp.add(rs.getString("AdType"));
                temp.add(rs.getString("CampDes"));
                
                if (rs.getBoolean("CampEnded") == false) {
                    temp.add("No");
                } else if (rs.getBoolean("CampEnded") == true) {
                    temp.add("Yes");
                }
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

