package Practice;

import java.util.Scanner;

public class Account {

		private String name ;
		private int salary ;
		private int pass ;
		
		public String getName() {
			return name;
		}
		
		public int getSalary() {
			if(username == ac.getName()&& userpass==ac.getPass()) {
				System.out.println(ac.getName()+" your Salary is: "+ac.getSalary());
			}else {
				System.out.println("Incorrect User Name or Password");
			}
			
		}
		
		
		
		public double getPass() {
			return pass;
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the User Name ");
			String username = sc.next();
			int userpass = sc.nextInt();
			
			Account ac = new Account();
		
		}


}
