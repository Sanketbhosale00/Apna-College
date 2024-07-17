package Arrays;
import java.util.*;
public class reverseArray {
	public static void reverseArray(int numbers[]) {
		int start=0,end=numbers.length-1;
		int temp=0;
		while(start<end) {
			temp=numbers[start];
			numbers[start]=numbers[end];
			numbers[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reverse Array is: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}	
	}
	public static void main(String[] args) {
		int numbers[]= {8,6,4,2,0};
		System.out.println("Given Array is: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("");
		reverseArray(numbers);
	}

}
