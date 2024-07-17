package Practice;

public class armstrong {

	public static void main(String[] args) {
		int num=370;
		int temp=num;
		int digit = 0;
		int last=0;
		int sum=0;
		
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum=(int) (sum+(Math.pow(last, digit)));
			temp=temp/10;
		}
		System.out.println(num+" "+sum);
		if(num==sum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}

	}

}
