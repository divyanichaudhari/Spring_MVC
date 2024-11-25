	package com.springcore.CollegeAnnotation;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	
	/**
	 * Hello world!
	 *
	 */
	public class App 
	{
	    public static void main( String[] args )
	    {
	    	ApplicationContext context = new AnnotationConfigApplicationContext(College.class);
	        System.out.println( "Hello World!" );
	        
	        College co = (College) context.getBean("hello", College.class);
	        
	        System.out.println("Here is the class " + co);
	        
	        co.test();
	        
	    }
	}
