package function;
import java.util.*;
public class prime_num {
	
	public static String checkprimeornot(int num) {
		int count=0;

		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				System.out.println(i);
				count=1;
				break;
			}	
		}
		if(count==1) {
			return "Not Prime";
		}else {
			return "Prime";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String name = checkprimeornot(num);
		System.out.println(name);
		

	}

}
