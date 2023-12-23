
package hib.dto;

public class Admintable
{
 private int adminId;
 private String password;

    public Admintable() 
    {
    }
    public Admintable(int adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public int getAdminId() 
    {
        return adminId;
    }

    public void setAdminId(int adminId) 
    {
        this.adminId = adminId;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
 
}
