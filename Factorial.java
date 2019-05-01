/**
 * @author Suhas KM
 * 
 * Program to find factorial of a given number using Recursion & Iterative approach
 *
 */
public class Factorial {

	public static void main(String[] args) {
		//finding factorial of a number in Java using recursion - Example
	      System.out.println("factorial of 5 using recursion in Java is: " + factUsingRecurssion(5)); 
	      
	      //finding factorial of a number in Java using Iteration - Example 
	       System.out.println("factorial of 6 using iteration in Java is: " + factUsingIterator(6)); 

	}

	private static int factUsingRecurssion(int n) {
		if(n == 1) return 1;
		
		return n * factUsingRecurssion(n - 1);

	}

	private static int factUsingIterator(int n) {
		int fact=1,i=1;
		while(i<=n) {
			fact = fact * n;
			n--;
		}
		return fact;
	}

}
