
package hib.dto;

public class Ordertable 
{
    private int orderid;
    private String renterName;
    private String buyerName;
    private int productId;
    private String productName;
    private String pickupAddress;
    private int amount;
    private String timePeriod;
    private String tandc;

    public Ordertable() {
    }

    public Ordertable(int orderid, String renterName, String buyerName, int productId, String productName, 
            String pickupAddress, int amount, String timePeriod, String tandc)
    {
        this.orderid = orderid;
        this.renterName = renterName;
        this.buyerName = buyerName;
        this.productId = productId;
        this.productName = productName;
        this.pickupAddress = pickupAddress;
        this.amount = amount;
        this.timePeriod = timePeriod;
        this.tandc = tandc;
    }

    public int getOrderid()
    {
        return orderid;
    }

    public void setOrderid(int orderid) 
    {
        this.orderid = orderid;
    }

    public String getRenterName()
    {
        return renterName;
    }

    public void setRenterName(String renterName)
    {
        this.renterName = renterName;
    }

    public String getBuyerName() 
    {
        return buyerName;
    }

    public void setBuyerName(String buyerName)
    {
        this.buyerName = buyerName;
    }

    public int getProductId() 
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getProductName() 
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getPickupAddress() 
    {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) 
    {
        this.pickupAddress = pickupAddress;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount) 
    {
        this.amount = amount;
    }

    public String getTimePeriod()
    {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) 
    {
        this.timePeriod = timePeriod;
    }

    public String getTandc()
    {
        return tandc;
    }

    public void setTandc(String tandc) 
    {
        this.tandc = tandc;
    }
    
    
}