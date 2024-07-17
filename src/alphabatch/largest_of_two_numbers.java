package alphabatch;
import java.util.*;
public class largest_of_two_numbers {

	public static void main(String[] args) {
	Scanner  sc= new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int A= sc.nextInt();
	int B=sc.nextInt();
	if(A>=B) {
		System.out.println("Largest Number is A="+A);
	}
	else {
		System.out.println("Largest Number is B= "+B);
	}

	}

}
