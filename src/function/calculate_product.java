package function;
import java.util.*;
public class calculate_product {
	
	public static int calculateProduct(int num1,int num2) {
		int mul = num1*num2;
		return mul;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int product = calculateProduct(num1,num2);
		System.out.println("Their product is: "+product);

	}

}
