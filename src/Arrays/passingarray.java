package Arrays;

public class passingarray 
{
	public static void update(int marks[]) {
		
		for(int i=0;i<marks.length;i=i+1) {
			marks[i] = marks[i]+4;
		}
	}

	public static void main(String[] args) {
		int marks[]= {90,94,72};
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		update(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();

	}

}
