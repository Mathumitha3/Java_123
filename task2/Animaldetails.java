package task2;


abstract class Animal //Abstract class
{
	abstract void sound();//Abstract method
}

class Lion extends Animal
{
	void sound()//method overriding
	{
		System.out.println("The lion Roars");
	}
}
class Tiger extends Animal
{
	void sound()//method overriding
	{
		System.out.println("The tiger Groans");
	}
}

public class Animaldetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal Animal1=new Tiger(); //
		Animal1.sound(); 
		Animal Animal2=new Lion();
		Animal2.sound();
	}

}
