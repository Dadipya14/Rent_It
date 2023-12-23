package hib.dto;

public class Producttable 
{
    private String productname;
    private String producttype;
    private String colour;
    private String feature;
    private String dimension;
    private String price;
    private String description;
    private int productid;
    private String tandc;

    public Producttable() {
    }

    public Producttable(String productname, String producttype, String colour, String feature, String dimension, String price, String description, int productid, String tandc) {
        this.productname = productname;
        this.producttype = producttype;
        this.colour = colour;
        this.feature = feature;
        this.dimension = dimension;
        this.price = price;
        this.description = description;
        this.productid = productid;
        this.tandc = tandc;
    }

    public String getProductname() 
    {
        return productname;
    }

    public void setProductname(String productname) 
    {
        this.productname = productname;
    }

    public String getProducttype() 
    {
        return producttype;
    }

    public void setProducttype(String producttype)
    {
        this.producttype = producttype;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour) 
    {
        this.colour = colour;
    }

    public String getFeature() 
    {
        return feature;
    }

    public void setFeature(String feature) 
    {
        this.feature = feature;
    }

    public String getDimension() 
    {
        return dimension;
    }

    public void setDimension(String dimension) 
    {
        this.dimension = dimension;
    }

    public String getPrice() 
    {
        return price;
    }

    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getProductid()
    {
        return productid;
    }

    public void setProductid(int productid) 
    {
        this.productid = productid;
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
