/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import Entity.Campaign;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author NickyVo
 */
public class ActualPC {
    
     private static String sql="SELECT [CampID],[CampName],"
             + "[CIS].[dbo].[Campaign].[ProID],[CIS].[dbo].[Product].[ProName],"
             + "[StartDate],[EndDate],[Period],"
             + "[CIS].[dbo].[Campaign].[AdID],[CIS].[dbo].[Advertisement].[AdType],"
             + "[estBudget],[actBudget],[estSale],[actSale],"
             + "[estVariance],[actVariance],[fnVariance],[CampDes],[CampEnded]"
             + "FROM [CIS].[dbo].[Campaign], [CIS].[dbo].[Product], [CIS].[dbo].[Advertisement] "
             + "WHERE  [CIS].[dbo].[Campaign].[ProID] = [CIS].[dbo].[Product].[ProID]"
             + "AND [CIS].[dbo].[Campaign].[AdID] = [CIS].[dbo].[Advertisement].[AdID] "
             + "ORDER BY [CIS].[dbo].[Campaign].[StartDate] DESC";
    //Method returns vector with all campaigns information
    public static Vector getCampaignTable()
    {
        Vector vt= new Vector();
        ResultSet rs= dataPC.createResultset(sql);
        try {
            while(rs.next())
            {
                Vector temp= new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                temp.add(rs.getString("ProID"));
                temp.add(rs.getString("ProName"));
                temp.add(rs.getDate("StartDate"));
                temp.add(rs.getDate("EndDate"));
                temp.add(rs.getFloat("Period"));
                temp.add(rs.getString("AdID"));
                temp.add(rs.getString("AdType"));
                
                temp.add(rs.getFloat("estBudget"));
                temp.add(rs.getFloat("actBudget"));
                temp.add(rs.getFloat("estSale"));
                temp.add(rs.getFloat("actSale"));
                temp.add(rs.getFloat("estVariance"));
                temp.add(rs.getFloat("actVariance"));
                temp.add(rs.getFloat("fnVariance"));
                temp.add(rs.getString("CampDes"));
                
               boolean est =(rs.getString("estBudget") != null)&&(rs.getString("estSale") != null)&&(rs.getString("estVariance") != null);
               boolean act =(rs.getString("actBudget") != null)&&(rs.getString("actSale") != null)&&(rs.getString("actVariance") != null);
                 if ((rs.getString("estBudget") == null)||(rs.getString("estSale") == null)||(rs.getString("estVariance") == null)) {
                    temp.add("Not Estimated Yet");
                } else if (est && !act) {
                    temp.add("Not Calculated Actual Data");
                } else if(est && act && rs.getString("fnVariance") != null){
                    temp.add("Finished");
                }                       
                vt.add(temp);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally
        {
            return vt;
        }
    }
    
    //return a vector capturing Campaign Information
    public static Vector readCampaign() {
        String sql = "select [CampID],[CampName],[actBudget],[actSale],[actVariance] "
                + "from [CIS].[dbo].[Campaign] order by CampID desc";
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                if ((rs.getString("actBudget") == null)||(rs.getString("actSale") == null)||(rs.getString("actVariance") == null)) {
                    temp.add("No");
                } else if ((rs.getString("actBudget") != null)&&(rs.getString("actSale") != null)&&(rs.getString("actVariance") != null)) {
                    temp.add("Yes");
                }

                vt.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return vt;
        }
    }
    
    // update actual information to a campaign
    public static String updateCampaign(Campaign camp) {
        String mess = "";
        int flag = dataPC.execStatement("update [CIS].[dbo].[Campaign] set "
                + "  [actBudget] = " + camp.getActualBudget()
                + ", [actSale] = " + camp.getActualSales()
                + ", [actVariance] = " + camp.getActualVariance()
                + ", [CampDes] = '" + camp.getDescription() + "'" 
                + ", [CampEnded] = 1" 
                + "  where [CampID] = '" + camp.getCampaignID() + "'");
        dataPC.execStatement("update [CIS].[dbo].[Campaign] set fnVariance = ABS(ROUND(actVariance-estVariance,1))");
        if (flag == 0) {
            mess = "Update fail";
        } else if (flag == -1) {
            mess = "SQL Exception";
        } else {
            mess = "Update successfully";
        }
        return mess;
    }
}
