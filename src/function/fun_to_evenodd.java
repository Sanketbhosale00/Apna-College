package function;
import java.util.*;
public class fun_to_evenodd {
	public static String checkEvenOdd(int num) {
		if(num%2==0) {
			return "Even Number";
		}else {
			return "Odd Number";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		String check= checkEvenOdd(num);
		System.out.println(check);
	}

}
