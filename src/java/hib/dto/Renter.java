
package hib.dto;

public class Renter
{
    private String name;
    private String email;
    private String password;
    private String address;
    private String productname;
    private int contactNum;

    public Renter() {
    }

    public Renter(String name, String email, String password, String address, String productname, int contactNum)
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.productname = productname;
        this.contactNum = contactNum;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getProductname()
    {
        return productname;
    }

    public void setProductname(String productname) 
    {
        this.productname = productname;
    }

    public int getContactNum() 
    {
        return contactNum;
    }

    public void setContactNum(int contactNum) 
    {
        this.contactNum = contactNum;
    }
    
    
}
