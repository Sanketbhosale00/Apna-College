package alphabatch;

public class reverse_given_num {

	public static void main(String[] args) {
		int num = 1099;
		int rev = 0;
		int remainder =0;
		for(int n= num;n>0;n=n/10) {
			remainder = n%10;
			rev = (rev*10)+ remainder;
		}
		System.out.println(rev);
	}

}
