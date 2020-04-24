/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author NickyVo
 */
public class Category {
    private String CateId;
    private String CateName;
    private String Description;
 
    
    public String getCateName() {
        return CateName;
    }

    public void setCateName(String CateName) {
        this.CateName = CateName;
    }

    public String getCateId() {
        return CateId;
    }

    public void setCateId(String CateId) {
        this.CateId = CateId;
    }

     public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}
