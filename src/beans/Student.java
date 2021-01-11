package beans;

public class Student {
	private String name;
	private String lastName;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, String lastName, int age) {
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
	
        public static Student getInstance(){
            return new Student("sepehr", "mollaei", 20);
        }
	
}
