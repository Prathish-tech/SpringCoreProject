package com.tnsif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {   
    	//Application context is the IoC container
    	//It reads and manages the beans
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        College college = (College)context.getBean("collegeBean");
        college.show();
    }
}