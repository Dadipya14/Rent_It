import hib.dto.Ordertable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 


public class OrderMainClass 
{
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Ordertable order =new Ordertable(12,"abc","cba",21,"ac","palasia",200,"onemonth","xyz");
    session.save(order);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }    
}
