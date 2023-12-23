import hib.dto.Producttable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import org.hibernate.classic.Session; 


public class UpdateProduct
{
    public static void main(String[]args)      
    {   
    SessionFactory sf=new Configuration().configure().buildSessionFactory();   
    
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter productid");
    int productid= sc.nextInt();
    Producttable ref= (Producttable)session.get(Producttable.class,productid);
    if(ref==null)
    {
    System.out.println("no record found to update");
    }
    else
    {
     System.out.println(ref.getProductid()+""+ref.getProductname()+""+ref.getPrice());
     System.out.println("enter updated price");
     String uPrice=sc.next();
     ref.setPrice(uPrice);
     session.update(ref);
     tx.commit();  
     System.out.println("record updated");
     System.out.println(ref.getProductid()+""+ref.getProductname()+""+ref.getPrice());
    }
    session.close();   
    }     

}
