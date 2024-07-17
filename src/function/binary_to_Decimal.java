package function;

public class binary_to_Decimal {
	public static void binTodecimal(int num) {
		int myNum=num;
		int dec = 0;
		int pow = 0;
		int lastdig=  0;
		while(num>0) {
			lastdig=num%10;
			dec=dec+(lastdig*(int)Math.pow(2, pow));
			pow++;
			num = num/10;
		}
		System.out.println("Binary number of "+myNum+" is "+dec);
	}

	public static void main(String[] args) {
		binTodecimal(1010);
	}

}
