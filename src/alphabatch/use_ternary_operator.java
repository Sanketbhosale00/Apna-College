package alphabatch;
import java.util.*;
public class use_ternary_operator {

	public static void main(String[] args) {
		System.out.println("Enter Your Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    String type = (num%2==0)? "Even":"Odd";
	    System.out.println(type);

	}

}
