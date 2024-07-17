package Practice;

public class Myclass {
	public static int checkDev(int arr[],int num) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=111) {
				return count;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%num==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {0,2,3,4,5,6};
		int num = 11;
		int count = checkDev(arr,num);
		System.out.println(count);
	}
}
