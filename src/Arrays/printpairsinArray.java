package Arrays;

public class printpairsinArray {
	public static void print_Pairs(int numbers[]) {
		int num = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				System.out.print("("+numbers[i]+","+numbers[j]+")");
				num++;
			}
			System.out.println();
		}
		System.out.println("Number of Pairs are: "+num);
	}
	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10};
		print_Pairs(numbers);

	}

}
