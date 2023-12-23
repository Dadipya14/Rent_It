import hib.dto.Complaintable;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session; 
import java.util.Scanner;

public class GetComplain  
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
    int complainid = sc.nextInt();
    Complaintable ref=(Complaintable)session.get(Complaintable.class,complainid);
    if(ref==null)
    {
     System.out.println("no record to found");
    }
    else
    {
    System.out.println(ref.getComplain()+" "+ref.getUsername()+" "+ref.getComplainid());
    }
    
     
    tx.commit(); 
    session.close();   
    System.out.println("record inserted!!!!!");  
    }
}