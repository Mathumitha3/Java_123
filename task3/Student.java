package task3;

public class Student {

	private String name;
	private int rollNumber;
	private double marks;
	
	public Student(String name,int rollNumber,double marks)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	public void display()
	{
		System.out.println("Name: " + this.name);
		System.out.println("RollNumber: " + this.rollNumber);
		System.out.println("Marks: " + this.marks);
	}
	
	public static void main(String[] args)
	{
		Student s1=new Student("Mathu",26,95);
		s1.display();
		Student s2=new Student("Deepa",12, 97.67);
		s2.display();
	}
}

