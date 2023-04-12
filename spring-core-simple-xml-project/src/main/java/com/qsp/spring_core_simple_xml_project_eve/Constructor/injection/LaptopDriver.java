package com.qsp.spring_core_simple_xml_project_eve.Constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
		
		Laptop laptop =(Laptop)applicationContext.getBean("ConstructorInjection");
		
		System.out.println(laptop);
		
		laptop.display();
		
	}
}
