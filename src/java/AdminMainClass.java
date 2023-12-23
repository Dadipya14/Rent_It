import hib.dto.Admintable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
public class AdminMainClass  
{ 
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Admintable admin=new Admintable(111,"abc111");
    session.save(admin);   
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
}