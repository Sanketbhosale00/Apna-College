package function;

public class dec_to_binary {
	public static void dectoBinary(int num) {
		int myNum=num;
		int bin=0;
		int pow = 0;
		while(num>0) {
			int rem=num%2;
			bin = bin+(int)(rem*Math.pow(10, pow));
			pow++;
			num=num/2;
		}
		System.out.println("Binary number is "+ bin);
	}

	public static void main(String[] args) {
		dectoBinary(7);

	}

}
