package function;
import java.util.*;
public class printFactorial {
	
	public static void printfactorial(int num) {
		if(num<0) {
			System.out.println("Invalid Number");
			return;
		}else if(num==0) {
			System.out.println("Factorial is: 1");
			return;
		}else {
		int factorial =1;
		for(int i=num;i>=1;i--) {
			factorial = factorial*i;
		}
		System.out.println("Factorial is: "+factorial);
		}
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	printfactorial(num);

	}

}
