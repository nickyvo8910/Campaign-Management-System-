/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author NickyVo
 */
public class Product {
    private int ProductID;
    private String CateId;
    private String CateName;
    private String ProductName;
    private String Description;
 
    
    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
     public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }
    public String getCateID() {
        return CateId;
    }

    public void setCateId(String CateId) {
        this.CateId = CateId;
    }
    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

     public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}
