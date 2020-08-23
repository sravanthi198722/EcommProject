package sravanthi.niit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sravanthi.niit.DAO.OrderDAOImpl;
import sravanthi.niit.DAO.OrderDAO;
import sravanthi.niit.Model.OrderDetail;



 public class OrderDAOTest {

	static OrderDAO orderDAO;
	
	 
	@BeforeClass
	public static void executefirst()
	
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("sravanthi.niit");
		context.refresh();
		orderDAO=(OrderDAO)context.getBean("orderDAO");
		

	
	}
	
	
	
	@Test
	public void testpayment() {
		OrderDetail orderInfo=new OrderDetail();
		orderInfo.setOrderDate(new java.util.Date());
		orderInfo.setTotalShippingAmount(77000);
		orderInfo.setUsername("sai");
		orderInfo.setPmode("COD");
		
		assertTrue ("Problem in Order Payment", orderDAO.payment(orderInfo));
		assertTrue ("Problem in Updating Payment",orderDAO.CartItemStatus(orderInfo.getUsername(),orderInfo.getOrderId()));
				
		
		
		
	}
		
		
		
		
		
		
		
		
	}
	

 
 
 
 
