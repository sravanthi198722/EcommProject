package sravanthi.niit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sravanthi.niit.DAO.UserDaoIntf;
import sravanthi.niit.Model.UserDetail;
import sravanthi.niit.DAO.UserDaoImpl;
import static org.junit.Assert.*;

public class UserDaoIntfTest { 
	
	 static UserDaoIntf userDAO;
	 
@BeforeClass
public static void executeFirst()
	
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("sravanthi.niit");
	context.refresh(); 
	userDAO=(UserDaoIntf) context.getBean("userDAO");}
	
  @Test
 public void testregisterUser()
 {
	 
	 UserDetail user=new  UserDetail();
	 
	 user.setUsername("sai");
	 user.setCustomerName("sai p");
	 user.setAddress("tnagar,chennai");
	 user.setEmailId("abcdef@gmail.com");
	 user.setEnabled(true);
	 user.setMobileNo("9000000002");
	 user.setPassword("6789");
	 user.setRole("ROLE_USER");
	 
	 assertTrue("Problem in Adding User:",userDAO.registerUser(user));
	 
 }
}