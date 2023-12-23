
package hib.dto;

public class Usertable 
{
    private String username;
    private String email;
    private String password;
    private String address;
    private long contact;

    public Usertable() {
    }

    public Usertable(String username, String email, String password, String address, long contact) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
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

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
    
    
    
}
