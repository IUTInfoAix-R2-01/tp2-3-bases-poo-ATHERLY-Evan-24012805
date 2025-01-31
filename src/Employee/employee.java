package Employee;

public class employee {
	private int id,salary;
	private String firstName,lastName;
	
	employee(final int id,final String firstName,final String lastName, final int salary){
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	public int raiseSalary(int percent) {
		return this.salary + (this.salary * percent/100);
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	
}
