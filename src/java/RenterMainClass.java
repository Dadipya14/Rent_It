import hib.dto.Renter;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
public class RenterMainClass 
{
     public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Renter renter =new Renter("abc","abc@gmail.com","abc","palasia","ac",8786456);
    session.save(renter);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }   
}
    

