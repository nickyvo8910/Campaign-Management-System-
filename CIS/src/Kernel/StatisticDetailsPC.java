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
public class StatisticDetailsPC {
    
    private static String sql="SELECT [CampID],[CampName],"
             + "[CIS].[dbo].[Campaign].[ProID],[CIS].[dbo].[Product].[ProName],"
             + "[StartDate],[EndDate],[Period],"
             + "[CIS].[dbo].[Campaign].[AdID],[CIS].[dbo].[Advertisement].[AdType],"
             + "[estBudget],[actBudget],[estSale],[actSale],"
             + "[estVariance],[actVariance],[fnVariance],[CampDes],[CampEnded]"
             + "FROM [CIS].[dbo].[Campaign], [CIS].[dbo].[Product], [CIS].[dbo].[Advertisement] "
             + "WHERE  [CIS].[dbo].[Campaign].[ProID] = [CIS].[dbo].[Product].[ProID]"
             + "AND [CIS].[dbo].[Campaign].[AdID] = [CIS].[dbo].[Advertisement].[AdID] "
             + "AND [CampID] =";             
    
   //Method returns vector campaign's information
    public static Vector getCampaign(int id)
    {       
        Vector vt= new Vector();
        ResultSet rs= dataPC.createResultset(sql+id);
        
        try {
            while(rs.next())
            {
                vt.add(rs.getString("CampID"));//0
                vt.add(rs.getString("CampName"));//1
                vt.add(rs.getString("ProID"));//2
                vt.add(rs.getString("ProName"));//3
                vt.add(rs.getDate("StartDate"));//4
                vt.add(rs.getDate("EndDate"));//5
                vt.add(rs.getFloat("Period"));//6
                vt.add(rs.getString("AdID"));//7
                vt.add(rs.getString("AdType"));//8
                
                vt.add(rs.getFloat("estBudget"));//9
                vt.add(rs.getFloat("actBudget"));//10
                vt.add(rs.getFloat("estSale"));//11
                vt.add(rs.getFloat("actSale"));//12
                vt.add(rs.getFloat("estVariance"));//13
                vt.add(rs.getFloat("actVariance"));//14
                vt.add(rs.getFloat("fnVariance"));//15
                vt.add(rs.getString("CampDes"));//16
                
                //17
               boolean est =(rs.getString("estBudget") != null)&&(rs.getString("estSale") != null)&&(rs.getString("estVariance") != null);
               boolean act =(rs.getString("actBudget") != null)&&(rs.getString("actSale") != null)&&(rs.getString("actVariance") != null);
                 if ((rs.getString("estBudget") == null)||(rs.getString("estSale") == null)||(rs.getString("estVariance") == null)) {
                    vt.add("Not Estimated Yet");
                } else if (est && !act) {
                    vt.add("Not Calculated Actual Data");
                } else if(est && act && rs.getString("fnVariance") != null){
                    vt.add("Finished");
                }       
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally
        {
            return vt;
        }
    }
}
