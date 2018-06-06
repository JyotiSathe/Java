package com.tcs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("beans.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource); 
		Employee e=(Employee)factory.getBean("emp");
		System.out.println(e);
	}

}
