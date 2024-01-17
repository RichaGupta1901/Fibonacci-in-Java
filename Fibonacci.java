// Name: Richa Gupta
// PRN: 22070126087
// Batch: AIML B1


// Command line statemnets
import java.io.*;
import java.util.*;

// Fibonacci class
class Fibonacci{
	// Main method
    public static void main(String arg[]){
		// Command Line Args (commented out)
		//int number = Integer.parseInt(arg[0]);
		// Parse: to change the dtype
		
		// Scanner (commented out)
		/*System.out.println("Enter Number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		*/
		
		// BufferedReader (commented out)
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter Number");
			int number = Integer.parseInt(reader.readLine());
			for (int i = 0; i < number; i++){

			System.out.println(fibonacci(i)+" ");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}*/
		
		// System.Console
		System.out.println("Enter Number:");
		int number = Integer.parseInt(System.console().readLine());
		System.out.println("---------------");
		System.out.println("The Fibonacci series uptill " + number + " numbers is:");
		for (int i = 0; i < number; i++){

			System.out.println(fibonacci(i) + " ");
		}

    }
	
	// Fibonacci method
    public static int fibonacci(int n){
		// Recursive method to calculate Fibonacci sequence
        if (n <= 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}