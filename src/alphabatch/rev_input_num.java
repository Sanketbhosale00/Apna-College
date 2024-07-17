package alphabatch;
import java.util.*;
public class rev_input_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int rev=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			System.out.println("new remainder: "+rem);
			rev=(rev*10)+rem;
			System.out.println("new reverse: "+rev);
			num=num/10;
			System.out.println("new number: "+num);
		}
		System.out.println("\n\n\n\nReverse of given num is:"+rev);
	}
	
	
					//for understanding run this
//		while(num>0) {
//			rem=num%10;
//			System.out.println("new remainder: "+rem);
//			rev=(rev*10)+rem;
//			System.out.println("new reverse: "+rev);
//			num=num/10;
//			System.out.println("new number: "+num);
//		}
//		System.out.println("\n\n\n\nReverse of given num is:"+rev);
//	}

}
