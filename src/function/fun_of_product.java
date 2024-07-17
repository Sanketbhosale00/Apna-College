package function;
import java.util.*;
public class fun_of_product {
	public static int product(int a, int b) {
		int prod = a*b;
		return prod;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int mul = product(a,b);
		System.out.println("Multipliacation is: "+mul);
		a=20;
		b=10;
		int multi = product(a,b);
		System.out.println("Product is: "+multi);

	}

}
