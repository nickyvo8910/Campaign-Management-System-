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
public class StatisticPC {
     
     public static Vector readCampaign() {
        String sql = "select [CampID],[CampName],[estVariance],[actVariance],[fnVariance]"
                + "from [CIS].[dbo].[Campaign] order by CampID desc";
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                temp.add(rs.getFloat("estVariance"));
                temp.add(rs.getFloat("actVariance"));
                temp.add(rs.getFloat("fnVariance"));
                vt.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            return vt;
        }
    }
    
    //method find campaign by value and type 
    public static Vector FindCampaign(String value, int type) {
        Vector vt = new Vector();
        String sql3 = "";
        if (type == 1) {
            sql3 = "select [CampID],[CampName],[estVariance],[actVariance],[fnVariance]"
                +  "FROM [CIS].[dbo].[Campaign]"
                + "WHERE CampID like'%" + value + "%'"
                + "order by CampID desc";
        } else {
            sql3 = "select [CampID],[CampName],[estVariance],[actVariance],[fnVariance]"
                + "FROM [CIS].[dbo].[Campaign]"
                + "WHERE CampName like'%" + value + "%'"
                + "order by CampID desc";
        }
        ResultSet rs = dataPC.createResultset(sql3);
        try {
            //begin while
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("CampID"));
                temp.add(rs.getString("CampName"));
                temp.add(rs.getFloat("estVariance"));
                temp.add(rs.getFloat("actVariance"));
                temp.add(rs.getFloat("fnVariance"));
                
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
