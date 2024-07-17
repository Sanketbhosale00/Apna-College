package function;
import java.util.*;
public class practice_que_3 {
	public static String palinDrome(int num) {
		int rem=0;
		int rev=0;
		for(int i=num;i>0;i=i/10) {
			rem=i%10;
			rev = (rev*10)+rem;
		}
		if(num==rev) {
			return "paindrome";
		}else {
			return "not paindrome";
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(palinDrome(number));
		

	}

}
