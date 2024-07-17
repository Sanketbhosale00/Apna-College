package function;
import java.util.*;
public class practice_qque_1 {
	public static float average_of_num() {
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		float avg = (num1+num2+num3)/3;
		return avg;
	}

	public static void main(String[] args) {
		System.out.println(average_of_num());	

	}

}
