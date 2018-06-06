package com.tcs;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class TestStudent {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("beans.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    //student.setName("Jyoti");
    student.displayInfo();  
    //System.out.println(student);
    Student s=(Student)factory.getBean("stud");
    System.out.println(s);
}  
}