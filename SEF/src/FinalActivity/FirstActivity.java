package FinalActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstActivity extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws FileNotFoundException {
		
		//create the list of employee
		ArrayList<Employee> myList = new ArrayList<> ();
		
		//create 3 objects of employee class
		Employee pE1 = new Employee("John", 30, "Manager", "CocaCola", 3000);
		Employee pE2 = new Employee("Nick", 30, "Director", "Nokia", 5000);
		Employee pE3 = new Employee("Matt", 30, "Big Boss", "Samsung", 20000);
		
		//add into arraylist
		myList.add(pE1);
		myList.add(pE2);
		myList.add(pE3);
		
		//create array of employee class
		Employee[] employees = new Employee[3];
		 
		//add into array some objects of employee class
		employees[0] = new Employee("John Wick", 3000);
		employees[1] = new Employee("Nick Black", 5000);
		employees[2] = new Employee("Matt Daiment", 20000);
		
		
		//try to write information to the textFile
		//first try to write the array
		//second try to write arrayList
		try {
//			FileOutputStream fos = new FileOutputStream("TestFile");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(employees);
//			oos.writeObject(myList);
//			fos.close();
			
			File file = new File("TestFile.txt");
			
			if(file.exists())
				System.out.println("File opened!!");
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("Test line for file write!");
			for(Employee employee: myList) {
				
				pw.println(employee);
			}
			pw.println("Ena file!");
			pw.close();
			System.out.println("File closed!!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(employees));
		
		//sort array from top salary to less
		Arrays.sort(employees, Collections.reverseOrder());
		
		//print them from top salary to less
		System.out.println(Arrays.toString(employees));
		System.out.println("=============================\n");
		
		
		//try to sort from top salary to less with if else
		if (pE1.getSalary() > pE2.getSalary() ) {
			if (pE1.getSalary() > pE3.getSalary()){
				if(pE2.getSalary() > pE3.getSalary()) {
					System.out.println(pE1.introduce());
					System.out.println(pE2.introduce());
					System.out.println(pE3.introduce());
					} else {
					System.out.println(pE1.introduce());
					System.out.println(pE3.introduce());
					System.out.println(pE2.introduce());
					}
				}
		} else {
			if (pE2.getSalary() > pE3.getSalary()){
				if(pE1.getSalary() > pE3.getSalary()) {
					System.out.println(pE2.introduce());
					System.out.println(pE1.introduce());
					System.out.println(pE3.introduce());
					}else {
					System.out.println(pE2.introduce());
					System.out.println(pE3.introduce());
					System.out.println(pE1.introduce());
					}
			} else {
				if(pE1.getSalary() > pE2.getSalary()) {
					System.out.println(pE3.introduce());
					System.out.println(pE1.introduce());
					System.out.println(pE2.introduce());
					}else {
					System.out.println(pE3.introduce());
					System.out.println(pE2.introduce());
					System.out.println(pE1.introduce());
				}
			}
		}

		
		
		

	}

}
