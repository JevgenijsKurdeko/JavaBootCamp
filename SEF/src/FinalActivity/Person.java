package FinalActivity;



public abstract class Person {

	//Attributes
	public String name;
	public String surName;
	public int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name)throws IncorrectFileNameException {
		
		if (name.matches("[a-zA-Z]+")){
			this.name = name;
			}
		else {
			throw new IncorrectFileNameException("Incorrect Name : " + name );}
		
	}
	public String getSurName() {
		return surName;
	}
	public void setSurNmae(String surName)throws IncorrectFileNameException {
		
		if (surName.matches("[a-zA-Z]+")){
			this.surName = surName;
			}
		else {
			throw new IncorrectFileNameException("Incorrect Surname : " + surName );}
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String introduce(){
		return "My name is " + name + "and i am" + age + "years old.";
	}
	
}
