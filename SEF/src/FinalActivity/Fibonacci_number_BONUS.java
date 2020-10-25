package FinalActivity;

public class Fibonacci_number_BONUS {
	//Easy way of fibonacci number:
	
	static int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c;
		if(n == 0)
			return a;
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	//Not easy way of fibonacci number using recursion
	
	static int fibonacciRec(int n) {
		if (n <= 1)
			return n;
		return fibonacciRec(n - 1) + fibonacciRec(n - 2);
	}
	

	public static void main(String[] args) {
		
		int n = 9;
		System.out.println(fibonacci(n));

	}

}
