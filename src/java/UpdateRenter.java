import hib.dto.Renter;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import org.hibernate.classic.Session; 

public class UpdateRenter
{
    public static void main(String[]args)      
    {   
    SessionFactory sf=new Configuration().configure().buildSessionFactory();   
    
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter email");
    String email= sc.next();
    Renter ref=(Renter)session.get(Renter.class,email);
    if(ref==null)
    {
    System.out.println("no record found to update");
    }
    else
    {
     System.out.println(ref.getAddress()+""+ref.getContactNum()+""+ref.getName()+""+ref.getProductname());
     System.out.println("enter updated contact number");
     String uContactNum=sc.next();
     ref.setAddress(uContactNum);
     session.update(ref);
     tx.commit();  
     System.out.println("record updated");
     System.out.println(ref.getAddress()+""+ref.getContactNum()+""+ref.getName()+""+ref.getProductname());
    }
    session.close();   
    }     

}
