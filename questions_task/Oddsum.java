package questions_task;

public class Oddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i=1;i<=50;i=i+2)
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("Total : " + sum);
	}

}
