
package hib.dto;

public class Complaintable 
{
 private int complainid;
 private String username;
 private String complain;

    public Complaintable() {
    }

    public Complaintable(int complainid, String username, String complain)
    {
        this.complainid = complainid;
        this.username = username;
        this.complain = complain;
    }

    public int getComplainid()
    {
        return complainid;
    }

    public void setComplainid(int complainid) 
    {
        this.complainid = complainid;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getComplain() 
    {
        return complain;
    }

    public void setComplain(String complain) 
    {
        this.complain = complain;
    }
 
 
}
