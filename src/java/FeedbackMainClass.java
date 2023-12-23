import hib.dto.Feedbacktable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 

public class FeedbackMainClass 
{
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    
    Feedbacktable feedback=new Feedbacktable(123,"abc","bad");
    session.save(feedback);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
    
}
