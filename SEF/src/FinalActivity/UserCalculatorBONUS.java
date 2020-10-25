package FinalActivity;

import java.util.Scanner;

public class UserCalculatorBONUS extends Second_Activity_Calculator {
		
	//BONUS TASK
		//5)In second activity try to implement user interface for:
        // 1) insert values from keyboard
        // 2) choose type of calculation
	
	public static void main(String[] args) {
		
		boolean bool = false;
		Scanner input = new Scanner(System.in);
		Second_Activity_Calculator calc = new Second_Activity_Calculator();
		
		do {
			
			System.out.println("Hello to my Calculator!");
			System.out.println("Right please two numbers: ");
			System.out.println("First number: ");
			int number1 = input.nextInt();
			System.out.println("Second number: ");
			int number2 = input.nextInt();
			System.out.println("Choose your action with numbers: ");
			System.out.println("1. ADD ( + )");
			System.out.println("2. Difference ( - )");
			System.out.println("3. Multiply ( * )");
			System.out.println("4. Divide ( / )");
			System.out.println("5. Exit from programm.");
			int action = input.nextInt();
			switch(action) {
				case 1 :
			      int sum = calc.getSum(number1, number2);
			      System.out.println("Addition of numbers: " + sum);
						break;
			   	case 2 :
			      int dif = calc.getDifference(number1, number2);
			      System.out.println("Subtraction of numbers: " + dif);
			   			break; 
				case 3 :
					double mul = calc.getProduct(number1, number2);
					System.out.println("Multiply of numbers: " + mul);
						break; 
				case 4 :
				     double div = calc.getQuotient(number1, number2);
				     System.out.println("Divide of numbers: " + div);
				      	break; 
				case 5 :
				      bool = true;
				      	break; 
			   
			   // You can have any number of case statements.
				default : // Optional
			      // Statements
			}
			
			
			
		}while(!bool);
		input.close();
	}

}
