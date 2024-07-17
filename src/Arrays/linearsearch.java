package Arrays;

public class linearsearch {
	public static int linearSearch(int numbers[], int key) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==key) {
				return i;
			}
			}
		return -1;
		}
	

	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10,12,14,16};
		int key=10;
		int value=linearSearch(numbers,key);
		if(value==-1) {
			System.out.println("Number Not found at any position");
		}else
		{
			value=value+1;
			System.out.println("Number found at Position: "+value);
		}

	}

}
