import hib.dto.Complaintable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 

public class ComplainMainClass 
{
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    
    Complaintable complain=new Complaintable(123,"abc","bad");
    session.save(complain);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
}
