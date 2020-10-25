package FinalActivity;

import java.io.Serializable;

public class Employee extends Person implements Comparable<Employee>, Humanity, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Attributes
	private String jobTitle;
	private String company;
	private int salary;
	
	//Constructor
	public Employee() {
		//System.out.println("Default constractor!");
	}
	
	public Employee(String n, int sal) {
		super.name = n;
		this.salary = sal;
		//System.out.println("Constractor for name and age!");
	}
	
	public Employee(String n, int a, String job) {
		super.name = n;
		super.age = a;
		this.jobTitle = job;
		//System.out.println("Constractor for name, age and job Title!");
	}
	
	public Employee(String n, int a, String job, String com){
		super.name = n;
		super.age = a;
		this.jobTitle = job;
		this.company = com;
		//System.out.println("Constractor for name, age, job Title and company name!");
	}
	
	public Employee(String n, int a, String job, String com, int sal){
		super.name = n;
		super.age = a;
		this.jobTitle = job;
		this.company = com;
		this.salary = sal;
		//System.out.println("Constractor for name, age, job Title and company name and salary!");
	}
	//method for introduce
		public String introduce(){
			return "My name is " + super.getName() + " and i am " + super.getAge() + " years old I am work as " + jobTitle + " in " + company + " and my Salary - " + salary;
		}
		
	// getter/setter for jobTitle
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String job) {
		this.jobTitle = job;
	}
	
	// getter/setter for company
	public String getCompany() {
		return company;
	}
	public void setCompany(String com) {
		this.company = com;
	}
	
	// getter/setter for salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		return this.salary - employee.salary;
		
	}
	
	public String toString() {
	    return String.format("(%s, %d)", name, salary);
	}

	@Override
	public void showInfo() {
		System.out.println("My name is " + super.name);
		
	}

	@Override
	public void sleep() {
		System.out.println("I am sleeping right now!!!");
		
	}

}
