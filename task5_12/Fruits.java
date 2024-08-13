package task5_12;

public class Fruits {

	 String Fname;
	 static int number_of_fruit=0;
	 
	 Fruits(String Fname)
	 {
		 this.Fname=Fname;
		 number_of_fruit=10;
	 }
	 public void print(String color)
	 {	 
		 System.out.println("Fruit name : " + Fname);
		 System.out.println("Fruit color : " + color);
		 System.out.println("Total no of fruit : " + number_of_fruit);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fruits fs1=new Fruits("Apple");
		fs1.print("Red");
		
		Fruits fs2=new Fruits("Orange");
		fs2.print("Orange");
		
	}

}
