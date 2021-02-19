package logic;

public class Worker {
	
	private String firstName;
	private String lastName;
	private int age; 
	
	public Worker(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
