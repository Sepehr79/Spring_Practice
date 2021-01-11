package beans;

public class Person {
	
	private String name;
	private String lastName;
	private int age;
	private Country country;
	
	public static final Person person = new Person("sepehr", "mollaei", 20);
	
	
	public Person() {
		
	}
	
	public Person(String name, String lastName, int age, Country country) {
		super();
		this.setName(name);
		this.setLastName(lastName);
		this.setAge(age);
		this.setCountry(country);
	}
	
	

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	

	
}
