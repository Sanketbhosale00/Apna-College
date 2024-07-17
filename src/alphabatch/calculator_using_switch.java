package alphabatch;
import java.util.*;
public class calculator_using_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Enter the operator for 1.sum(+)\n2.sub(-)\n3.mul(*)\n4.Div(/)\n5.Remainder(%)");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		
		case '+' : System.out.println("Sum is: "+ a+b);
					break;
		case '-' : System.out.println( a-b);
					break;
		case '*' : System.out.println("mul is: "+ a*b);
					break;
		case '/' : System.out.println("Division is:"+ a/b);
					break;
		case '%' : System.out.println("Remainder is:"+ a%b);
					break;
		default : System.out.println("Wrong chice MC!");
		
		}

	}

}
