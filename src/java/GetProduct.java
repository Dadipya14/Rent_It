import hib.dto.Producttable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
import java.util.Scanner;

public class GetProduct  
{ 
    public static void main(String[]args)      
    {   
    Configuration c=new Configuration();   
    Configuration c1=c.configure();   
    SessionFactory sf=c1.buildSessionFactory();  
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter complain id");
    int productid = sc.nextInt();
    Producttable ref=(Producttable)session.get(Producttable.class,productid);
    if(ref==null)
    {
     System.out.println("no record to found");
    }
    else
    {
    System.out.println(ref.getProductname()+""+ref.getProductname()+""+ref.getProducttype()+""+ref.getColour()+
            ""+ref.getFeature()+""+ref.getDimension()+""+ref.getPrice()+""+ref.getDescription()+""+ref.getTandc());
    }
    
     
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
}