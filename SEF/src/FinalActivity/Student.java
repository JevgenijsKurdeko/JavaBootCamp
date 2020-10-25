package FinalActivity;

public class Student extends Person implements Humanity {
	
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Student () {}

		//Attributes
		private String schoolName;
	
	//method for introduce
	public String introduce(){
		return "I am study in university " +  schoolName;
	}
	
	
	// getter for String school
	public String getSchool() {
		return schoolName;
	}
	
	// setter for String school
	public void setSchool(String school) {
		this.schoolName = school;
	}


	@Override
	public void showInfo() {
		System.out.println("I am student and i study in  " + this.schoolName);
		
	}


	@Override
	public void sleep() {
		System.out.println("I am sleeping right now!!!");
		
	}
	
	
	
}
