package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Company;
import beans.Country;
import beans.Person;
import beans.Student;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("fuuuuuuck");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getCountry().getCities().get(0));
		
		Company company =(Company) context.getBean("company");
		System.out.println(company.getEmployees().get(1).getName());
		System.out.println(company.getUserPass().get("admin"));
		
		Person child = (Person) context.getBean("child");
		System.out.println(child.getCountry().getCities().get(0));
		
		/**
		 * injection by settes
		 */
		Person setterPerson = (Person) context.getBean("setterPerson");
		System.out.println(setterPerson.getAge());
		System.out.println(setterPerson.getCountry().getName());
		
		Country usa = (Country) context.getBean("usa");
		System.out.println(usa.getName());
		System.out.println(usa.getCities().get(0));
		
		/**
		 * Autowiring in Spring
		 */
		Person kamran = (Person) context.getBean("kamran");
		System.out.println(kamran.getCountry().getName());
                
		/**
		 * factory in spring
		 */
		Student student = (Student) context.getBean("std");
                System.out.println(student.getName());
		
		
		
	}
}
