package tasknew;

import java.util.Scanner;

public class Maths {
	
	
    static int num1,num2;
	public void Add() {
		int add=num1+num2;
		System.out.println("The Addition of " + num1 + " and " + num2 + " is "  + add);
	}
	
	public void Sub() {
		int sub=num1-num2;
		System.out.println("The Subtraction of " + num1 + " and " + num2 + " is "  + sub);
	}
	
	public void Mul() {
		int mul=num1*num2;
		System.out.println("The Addition of " + num1 + " and " + num2 + " is "  + mul);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1st number: ");		
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		
		
		System.out.println("Enter 2nd number: ");
		num2=sc.nextInt();
		
		Maths result=new Maths();
		result.Add();
		result.Sub();
		result.Mul();
	}

}
