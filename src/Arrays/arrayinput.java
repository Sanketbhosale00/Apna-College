package Arrays;
import java.util.*;
public class arrayinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int num[] = new int[4];
	      for(int i=0;i<4;i++){
	      num[i] = sc.nextInt();
	      }
	      for(int i=0;i<4;i++){
	        System.out.println(i+" = "+num[i]);
	      }
	

	}

}
