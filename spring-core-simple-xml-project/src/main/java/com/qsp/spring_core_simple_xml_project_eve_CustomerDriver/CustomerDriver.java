package com.qsp.spring_core_simple_xml_project_eve_CustomerDriver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qsp.spring_core_simple_xml_project.setter.injection.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Myspring.xml");
	
	Customer customer=(Customer)applicationContext.getBean("setterInjection");
	
	System.out.println(customer.getId());
	System.out.println(customer.getName());
	System.out.println(customer.getEmail());
	
}

}
