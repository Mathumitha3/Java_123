package task6_13;

import java.util.Scanner;

public class loopSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Answer;
		System.out.println("Enter the 1st number : " );
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd number : " );
		int num2=sc.nextInt();
		
		System.out.println("Enter the cases(+,-,*,/) : ");
		char Choose=sc.next().charAt(0);
		
		switch(Choose)
		{
		case '+' :
			Answer=num1+num2;
			break;
		case '-' :
			Answer=num1-num2;
			break;
		case '*' :
			Answer=num1*num2;
			break;
		default:
			Answer=num1/num2;
			break;
		}
		
		System.out.println("The result is : " +Answer);
		
	}

}
