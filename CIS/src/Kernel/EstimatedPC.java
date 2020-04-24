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
public class EstimatedPC {
//return a vector capturing Campaign Information
    public static Vector readCampaign() {
        String sql = "select [CampID],[CampName],[estBudget],[estSale],[estVariance] "
                + "from [CIS].[dbo].[Campaign] order by CampID desc";
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                if ((rs.getString("estBudget") == null)||(rs.getString("estSale") == null)||(rs.getString("estVariance") == null)) {
                    temp.add("No");
                } else if ((rs.getString("estBudget") != null)&&(rs.getString("estSale") != null)&&(rs.getString("estVariance") != null)) {
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
    
    // update estimated information to a campaign
    public static String updateCampaign(Campaign camp) {
        String mess = "";
        int flag = dataPC.execStatement("update [CIS].[dbo].[Campaign] set "
                + "  [estBudget] = " + camp.getEstimatedBudget()
                + ", [estSale] = " + camp.getEstimatedSales()
                + ", [estVariance] = " + camp.getEstimatedVariance()
                + ", [CampDes] = '" + camp.getDescription() + "'"                
                + "  where [CampID] = '" + camp.getCampaignID() + "'");
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
