import hib.dto.Ordertable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
import java.util.Scanner;

public class GetOrder  
{ 
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter order id");
    int orderid = sc.nextInt();
    Ordertable ref=(Ordertable)session.get(Ordertable.class,orderid);
    if(ref==null)
    {
     System.out.println("no record to found");
    }
    else
    {
    System.out.println(ref.getRenterName()+""+ref.getBuyerName()+""+ref.getProductId()+
            ""+ref.getProductName()+""+ref.getPickupAddress()+""+ref.getAmount()+""+ref.getTimePeriod());
    }
    
     
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
}