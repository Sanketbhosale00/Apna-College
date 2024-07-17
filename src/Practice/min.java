package Practice;

public class min {
	public static void main(String[] args) {
		int arr[]= { 3 , 9 , 1 , 5 , 8 };
		//index =    0   1   2   3
		// length = 4  index is always length-1 because it starts from 0
		 
		int size = arr.length;  // 5
		System.out.println(size);
		
		for(int i=0;i<size;i++) {        //	i = 0,	0<5 i = 1<5
			System.out.println(arr[i]);  //   3	9
			
		}

//		System.out.println(arr[0]);   // 3
//		System.out.println(arr[1]);   // 9
//		System.out.println(arr[2]);   // 1
//		System.out.println(arr[3]);   // 5
	}

}
