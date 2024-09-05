package questions_task;
import java.util.*;
public class Reversealpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String text=sc.nextLine();
		String newText="";
		for(int i=text.length()-1;i>=0;i--)
		{
			newText=newText+text.charAt(i);
		}
		System.out.println("Reversed tring is : " + newText);
	}

}
