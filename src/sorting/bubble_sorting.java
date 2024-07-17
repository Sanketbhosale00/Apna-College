package sorting;
import java.util.*;
public class bubble_sorting {
	public static void bubbleSorting(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int swap=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {5,4,3,1,2};
		bubbleSorting(arr);
		printArr(arr);

	}

}
