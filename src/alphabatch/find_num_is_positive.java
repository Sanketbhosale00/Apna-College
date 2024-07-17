package alphabatch;
import java.util.*;
public class find_num_is_positive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.print("Given Number is: ");
		String result = (num>=0)? "Positive":"Negative";
		System.out.println(result);

	}

}
