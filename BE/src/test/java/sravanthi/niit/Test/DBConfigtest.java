package sravanthi.niit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sravanthi.niit.Configuration.DBConfig;

public class DBConfigtest {
	public static void main(String[]args) {
		
		/*
		 * DBConfig da=new DBConfig(); da.getH2Datasource();
		 */
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		   context.scan("sravanthi.niit");
		   
		   context.refresh();	  
		   System.out.println("Configuration success");
}
}