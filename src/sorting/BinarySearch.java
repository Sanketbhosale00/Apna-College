package sorting;

public class BinarySearch {
	public static int bin_Search(int array[],int key) {
		int start=0;
		int mid=(array.length-1)/2;
		int end=array.length-1;
		if(key==array[mid]) {
			return mid;
		}
		
		if(array[mid]<key) {
			for(int i=mid+1;i<=end;i++) {
				if(key==array[i]) {
					return i;
				}
			}
			return -1;
		}
		
		if(array[mid]>key) {
			
			for(int i=start;i<=mid-1;i++) {
				if(key==array[i]) {
					return i;
				}
			}
			return -1;
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14,16,18,20};
		//          0 1 2 3 4  5  6  7  8  9 
		//System.out.println(arr.length);
		int key=160;
		int index = bin_Search(arr,key);
		if(index>=0) {
			System.out.println("Array found at index: "+index);
		}else {
			System.out.println("Array not Found!");
		}

	}

}
