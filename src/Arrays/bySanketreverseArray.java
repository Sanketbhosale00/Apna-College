package Arrays;
import java.util.*;
public class bySanketreverseArray {
	public static void reverse_Array(int numbers[]) {
		int temp;
		for(int i=0;i<numbers.length/2;i++) {
			temp=numbers[i];
			numbers[i]=numbers[numbers.length-1-i];
			numbers[numbers.length-1-i]=temp;
		}
		System.out.println("\nReverse Array is: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

	public static void main(String[] args) {
		int numbers[]= {2,3,4,9,10,11,13,17};
		System.out.println("Given Array is: ");
		for(int i=0;i<numbers.length;i++) {
			
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\n\n");
		reverse_Array(numbers);

	}

}
