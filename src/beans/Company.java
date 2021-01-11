package beans;

import java.util.List;
import java.util.Map;

public class Company {
	
	private String name;
	private List<Person> employees;
	private Map<String, String> userPass;
	
	public Company() {
		
	}
	
	public Company(String name, List<Person> employees, Map<String, String> userPass) {
		super();
		this.name = name;
		this.employees = employees;
		this.userPass = userPass;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}

	public Map<String, String> getUserPass() {
		return userPass;
	}

	public void setUserPass(Map<String, String> userPass) {
		this.userPass = userPass;
	}
	
	
}
