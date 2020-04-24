/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author NickyVo
 */
public class Advertisement {
    private String adId;
    private String AdType;
    private String Description;
    private String AdPartner;
    public float AdPrice;


 
    public String getAdType() {
        return AdType;
    }

    public void setAdType(String AdType) {
        this.AdType = AdType;
    }
    public void setAdPartner(String AdPartner) {
        this.AdPartner = AdPartner;
    }
     public void setAdPrice(float AdPrice){
         this.AdPrice = AdPrice;
     }
    
     public void setAdID(String AdvertisementID) {
        this.adId = AdvertisementID;
    }
    /**
     * @return the CampaignID
     */
    public String getAdvertisementID() {
        return adId;
    }
     public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    public String getAdPartner (){
        return AdPartner;
    }
     public float getAdPrice() {
        return AdPrice;
    }
  
            
   
}
