package function;
import java.util.*;
public class calculate_sum {
	public static int calculateSum(int n1,int n2) {
		int sum = n1 + n2;
		return sum;
	} 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		
		int addition = calculateSum(n1,n2);
		System.out.println("Sum is: "+addition);
	}
}
