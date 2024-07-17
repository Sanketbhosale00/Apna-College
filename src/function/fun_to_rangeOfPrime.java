package function;

public class fun_to_rangeOfPrime {
	public static int isPrime(int num) {
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				return 1;
			}
		}
		

		return 0;
	}
	public static void PrimeinRange(int n) {
		for(int num=2;num<=n;num++) {
			if(isPrime(num)==0) {
				System.out.println(num);
			}
		}
		
	}

	public static void main(String[] args) {
		PrimeinRange(100);

	}

}
