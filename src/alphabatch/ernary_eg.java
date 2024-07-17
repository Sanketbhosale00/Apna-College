package alphabatch;
import java.util.*;
public class ernary_eg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks Of student");
		int marks= sc.nextInt();
		String result = (marks>=33)? "Pass" : "Fail";
		System.out.println(result);

	}

}
