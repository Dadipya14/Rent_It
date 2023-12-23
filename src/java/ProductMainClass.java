import hib.dto.Producttable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 

public class ProductMainClass 
{
     public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Producttable product =new Producttable("ac","electical","white","2ton","77cm","6000","goodcondition",123,"xyz");
    session.save(product);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }   
    
}
