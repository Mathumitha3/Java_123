package task4;

public class MethodOverload2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload ob=new MethodOverload();
		int result1=ob.Add(3, 5);
		System.out.println("The Addition of two integer number is : " + result1);
		double result2=ob.Add(5.15, 3.28);
		System.out.println("the Addition of two double number is : " + result2);
	}

}
