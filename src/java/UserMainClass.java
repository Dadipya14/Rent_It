import hib.dto.Usertable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
public class UserMainClass 
     
{
 public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    
    Usertable user =new Usertable("abc","abc@gmail.com","abc","palasia",8786456);
    session.save(user);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }      
}
