
package hib.dto;

public class Feedbacktable 
{
 private int feedbackid;
 private String username;
 private String feedback;

    public Feedbacktable() {
    }

    public Feedbacktable(int feedbackid, String username, String feedback) {
        this.feedbackid = feedbackid;
        this.username = username;
        this.feedback = feedback;
    }

    public int getFeedbackid() 
    {
        return feedbackid;
    }

    public void setFeedbackid(int feedbackid)
    {
        this.feedbackid = feedbackid;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getFeedback() 
    {
        return feedback;
    }

    public void setFeedback(String feedback) 
    {
        this.feedback = feedback;
    }
 
}
