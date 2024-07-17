package alphabatch;
import java.util.*;
public class fun_to_binomial_coeff {
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact= fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int r=sc.nextInt();
		int num = factorial(n);
		int deno1=factorial(r);
		int deno2 = factorial(n-r);
		int binocoef = num/(deno1 * deno2);
		System.out.println("Binomial coefficient of number is: "+binocoef);

	}

}
