package sravanthi.niit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBConfig1 {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
	context.scan("sravanthi.niit");
	context.getBean("datasource");
	context.refresh();
	System.out.println("CONFIGURATION SUCCESS");

	}
}
