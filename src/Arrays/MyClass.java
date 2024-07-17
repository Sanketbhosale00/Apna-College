package Arrays;

public class MyClass {
	
	public static int findMax(int arr[]) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		int max=findMax(arr);
		int min=findMin(arr);
		System.out.println(min);
		System.out.println(max);
	}
}
