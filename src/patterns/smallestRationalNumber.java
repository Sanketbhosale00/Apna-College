package patterns;

public class smallestRationalNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,-3,5,7};
		int ab=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ab) {
				ab++;
			}else {
				System.out.println("Number not Present: "+ab);
				break;
			}
		}
	}

}
