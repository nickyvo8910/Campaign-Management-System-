/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kernel;

import Entity.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author QUYDNGC60257
 */
public class ProductPC {
    private static String sql = "SELECT [ProID],[ProName],[ProDes],[CIS].[dbo].[Product].[CateID],[CIS].[dbo].[Category].[CateName]"
            + "FROM [CIS].[dbo].[Product],[CIS].[dbo].[Category]"
            + "WHERE [Product].[CateID]=[Category].[CateID]";
    
     //method return a vector contains all Campaign on database
    public static Vector readProduct() {
        Vector vt = new Vector();
        ResultSet rs = dataPC.createResultset(sql);
        try {
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("ProID"));
                temp.add(rs.getString("CateID"));
                temp.add(rs.getString("ProName"));
                temp.add(rs.getString("CateName"));
                temp.add(rs.getString("ProDes"));
                
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
        public static String insertProduct(Product product) {
        Vector vt = readProduct();
        String mess = "";
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(product.getProductName())) {
                return mess = "Cannot insert duplicate product ";
            }

        }
        String _sql = "insert into Product([ProName],[CateID],[ProDes]) values (?,?,?)";

        try {
            PreparedStatement pr = CommonConnection.conn.prepareStatement(_sql);
            pr.setString(1, product.getProductName());
            pr.setString(2, product.getCateID());
            pr.setString(3, product.getDescription());
            
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

    public static String updateProduct(Product product) {
        String mess = "";
        String sql2 = "update Product set ProName='" + product.getProductName()
                + "', CateID='" + product.getCateID()
                + "', ProDes='" + product.getDescription()
                + "' where ProID like'" + product.getProductID()
                + "'";
        Vector vt = readProduct();
        String proID = dataPC.getAnotherField("Product", "ProID", "ProName",Integer.toString(product.getProductID()));
        for (int i = 0; i < vt.size(); i++) {
            Vector temp = (Vector) vt.get(i);
            if (temp.get(1).toString().equals(product.getProductName()) && !temp.get(1).toString().equals(proID)) {
                return mess = "Cannot update duplicate product name ";
            }

        }
        int status = dataPC.execStatement(sql2);
        //dataPC.execStatement("update [CIS].[dbo].[Campaign] set Period = datediff(day, StartDate, EndDate)");
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
    public static String deleteProduct(String ID) {
        String mess = "";
        int flag1 = dataPC.execStatement("delete from Campaign where ProID = '" + ID + "'");
        int status = dataPC.execStatement("delete from Product where ProID = '" + ID + "'");
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
    public static Vector FindProduct(String value, int type) {
        Vector vt = new Vector();
        String sql3 = "";
        if (type == 1) {
            sql3 = "SELECT [ProID],[ProName],[ProDes],[CIS].[dbo].[Product].[CateID],[CateName]"
            + "FROM [CIS].[dbo].[Product],[CIS].[dbo].[Category]"
            + "WHERE [Product].[CateID]=[Category].[CateID] and ProID like'%" + value + "%'";
        } else {
            sql3 = "SELECT [ProID],[ProName],[ProDes],[CIS].[dbo].[Product].[CateID],[CateName]"
            + "FROM [CIS].[dbo].[Product],[CIS].[dbo].[Category]"
            + "WHERE [Product].[CateID]=[Category].[CateID] and ProName like'%" + value + "%'";
        }
        ResultSet rs = dataPC.createResultset(sql3);
        try {
            //begin while
            while (rs.next()) {
                Vector temp = new Vector();
                temp.add(rs.getString("ProID"));
                temp.add(rs.getString("CateID"));
                temp.add(rs.getString("ProName"));
                temp.add(rs.getString("CateName"));
                temp.add(rs.getString("ProDes"));
                
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
