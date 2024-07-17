package sorting;

public class Linear_Search {
	public static int linearSearching(int array[],int key) {
		int start = array[0];
		int end = array.length-1;
		for(int i=start;i<=end;i++) {
			if(array[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
	
		
	public static void main(String[] args) {
		int arr[] = {2,4,6,5,8,9,13,45};
		int key =45;
		int index= linearSearching(arr, key);
		if(index!=-1) {
		System.out.println("Key Found at Index: "+index);
		}else {
			System.out.println("Key Not Found!");
		}
		}
	}
