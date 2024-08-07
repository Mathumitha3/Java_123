package tasknew;

import java.util.Scanner;

public class AddStatic {
	

	static void Add()
	{
		
//		int a=3;
//		int b=5;
//		int c;
//		c = a+b;		
		System.out.println("Enter 1st number: ");		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		
		System.out.println("Enter 2nd number: ");		
		int num2=sc.nextInt();
		
		sc.close();
		int Add =num1+num2;
		System.out.println("The Addition of " + num1 + " and " + num2 + " is "  + Add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Add();
	}

}
