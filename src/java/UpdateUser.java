import hib.dto.Usertable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
import org.hibernate.classic.Session; 

public class UpdateUser 
{
 public static void main(String[]args)      
    {   
    SessionFactory sf=new Configuration().configure().buildSessionFactory();   
    
    Session session=sf.openSession();   
    Transaction tx=session.beginTransaction();   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter username ");
    String username= sc.next();
    Usertable ref=(Usertable)session.get(Usertable.class,username);
    if(ref==null)
    {
    System.out.println("no record found to update");
    }
    else
    {
     System.out.println(ref.getPassword()+""+ref.getContact()+""+ref.getAddress());
     System.out.println("enter updated address");
     String uAddress=sc.next();
     ref.setAddress(uAddress);
     session.update(ref);
     tx.commit();  
     System.out.println("record updated");
     System.out.println(ref.getPassword()+""+ref.getContact()+""+ref.getAddress());
    }
    session.close();   
    }     
}
