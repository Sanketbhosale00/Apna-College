package alphabatch;
import java.util.*;
public class factorial {
	public static int giveFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(giveFactorial(num));

	}

}
