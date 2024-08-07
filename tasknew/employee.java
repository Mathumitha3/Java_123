package tasknew;

import java.util.Scanner;

public class employee {
	
	
	
	 void empdetails() {
		System.out.println("Enter the Employee Id: ");
		Scanner id=new Scanner(System.in);
		int emp_id=id.nextInt();	
		
		System.out.println("Enter the Employee Name: ");
		Scanner name=new Scanner(System.in);
		String emp_name=name.nextLine();
		
		System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
//		System.out.println(emp_id);
//		System.out.println(emp_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
