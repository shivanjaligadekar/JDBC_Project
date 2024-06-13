package example.spring.rest;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String Proffession;
	
	public Person() {
		
	}
	public Person(String firstName, String lastName, int age, String proffession) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		Proffession = proffession;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getProffession() {
		return Proffession;
	}

	public void setProffession(String proffession) {
		Proffession = proffession;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", Proffession="
				+ Proffession + "]";
	}
	}


