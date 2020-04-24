/*
 * Campaign Object
 *
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author NickyVo
 */
public class Campaign {
    private int campId;
    private String campName;
    private String proId;
    private String proName;
    private Date startDate;
    private Date endDate ;
    private int period;
    private String adId;
    private String adType;
    private float EstimatedBudget;
    private float ActualBudget;
    private float EstimatedSales;
    private float ActualSales;
    private float EstimatedVariance;
    private float ActualVariance;
    private float UnevenVariance;
    private String campDes;
    private boolean camEnded;
    public Campaign() {
       
    }

    public Campaign(String CampaignName, String ProductID,String ProductName, Date StartDate, Date EndDate, int Per,String Ad,String AdType,String Description,boolean Ended) 
    {
        
        this.campName = CampaignName;
        this.proId = ProductID;
        this.proName = ProductName;
        this.startDate = StartDate;
        this.endDate = EndDate;
        this.period = Per;
        this.adId = Ad;
        this.adType= AdType;
        this.campDes = Description;
        this.camEnded = Ended;
        
    }
    /**
     * @param CampaignID the CampaignID to set
     */
    public void setCampaignID(int CampaignID) {
        this.campId = CampaignID;
    }
    /**
     * @return the CampaignID
     */
    public int getCampaignID() {
        return campId;
    }
    /**
     * @return the CampaignName
     */
    public String getCampaignName() {
        return campName;
    }
    /**
     * @param CampaignName the CampaignName to set
     */
    public void setCampaignName(String CampaignName) {
        this.campName = CampaignName;
    }
    /**
     * @return the ProductID
     */
    public String getProductId() {
        return proId;
    }
    /**
     * @param ProductID the ProductID to set
     */
    public void setProductID(String ProductID) {
        this.proId = ProductID;
    }
    /**
     * @return the ProductName
     */
    public String getProductName() {
        return proName;
    }
    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.proName = ProductName;
    }
    /**
     * @return the StartDate
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * @param StartDate the StartDate to set
     */
    public void setStartDate(Date StartDate) {
        this.startDate = StartDate;
    }
   /**
     * @return the EndDate
     */
    public Date getEndDate() {
        return endDate;
    }
  /**
     * @param EndDate the EndDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    /**
     * @return the Period
     */
    public int getPeriod() {
        return period;
    }
    /**
     * @param Period the Period to set
     */
    public void setPeriod(int Period) {
        this.period = Period;
    }
    /**
     * @return the AdID
     */
    public String getAdID() {
        return adId;
    }
    /**
     * @param AdID the AdID to set
     */
    public void setAdID(String AdID) {
        this.adId = AdID;
    }
     /**
     * @return the AdType
     */
    public String getAdType() {
        return adType;
    }
    /**
     * @param AdType the AdType to set
     */
    public void setAdType(String AdType) {
        this.adType = AdType;
    }
    /**
     * @return the EstimatedBudget
     */
    public float getEstimatedBudget() {
        return EstimatedBudget;
    }

    /**
     * @param EstimatedBudget the EstimatedBudget to set
     */
    public void setEstimatedBudget(float EstimatedBudget) {
        this.EstimatedBudget = EstimatedBudget;
    }

    /**
     * @return the ActualBudget
     */
    public float getActualBudget() {
        return ActualBudget;
    }

    /**
     * @param ActualBudget the ActualBudget to set
     */
    public void setActualBudget(float ActualBudget) {
        this.ActualBudget = ActualBudget;
    }

    /**
     * @return the EstimatedSale
     */
    public float getEstimatedSales() {
        return EstimatedSales;
    }

    /**
     * @param EstimatedSale the EstimatedSale to set
     */
    public void setEstimatedSales(float EstimatedSale) {
        this.EstimatedSales = EstimatedSale;
    }

    /**
     * @return the ActualSale
     */
    public float getActualSales() {
        return ActualSales;
    }

    /**
     * @param ActualSale the ActualSale to set
     */
    public void setActualSales(float ActualSale) {
        this.ActualSales = ActualSale;
    }

    /**
     * @return the EstimatedVariance
     */
    public float getEstimatedVariance() {
        return EstimatedVariance;
    }

    /**
     * @param EstimatedVariance the EstimatedVariance to set
     */
    public void setEstimatedVariance(float EstimatedVariance) {
        this.EstimatedVariance = EstimatedVariance;
    }

    /**
     * @return the ActualVariance
     */
    public float getActualVariance() {
        return ActualVariance;
    }

    /**
     * @param ActualVariance the ActualVariance to set
     */
    public void setActualVariance(float ActualVariance) {
        this.ActualVariance = ActualVariance;
    }

    /**
     * @return the UnevenVariance
     */
    public float getUnevenVariance() {
        return UnevenVariance;
    }

    /**
     * @param UnevenVariance the UnevenVariance to set
     */
    public void setUnevenVariance(float UnevenVariance) {
        this.UnevenVariance = UnevenVariance;
    }
    /**
     * @return the Description
     */
    public String getDescription() {
        return campDes;
    }
    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.campDes = Description;
    }

    /**
     * @return the Ended Status
     */
    public boolean getEnded() {
        return camEnded;
    }
    /**
     * @param Ended the Ended to set
     */
    public void setEnded(boolean Ended) {
        this.camEnded = Ended;
    }
}
