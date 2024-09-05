package questions_task;
import java.util.*;
public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//construtor of the Scanner class    
		Scanner scan = new Scanner("Do/your/work/self");    
		//Initialize the string delimiter    
		scan.useDelimiter("/");    
		//checks if the tokenized Strings has next token  
		while(scan.hasNext())  
		{    
		//prints the next token      
		System.out.println(scan.next());    
		}    
		//closing the scanner  
		scan.close();     
	}

}
