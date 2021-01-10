/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
/**
 * display IOC containers
 * @author Sepehr79
 */
public class Test {  
    public static void main(String[] args) {  
        
        /**
         * IOC containers
         */
        
        //BeanFactory
        Resource resource=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(resource);
        
        Student student=(Student)factory.getBean("studentbean");  
        student.displayInfo();  
        
        //ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student student2 = (Student) context.getBean("studentbean");
        student2.displayInfo();
        //***************************************
        
        /**
         * some examples
         */
        Employee emp = (Employee) factory.getBean("emp");
        emp.show();
    }  
}  