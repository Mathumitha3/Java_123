package task4;

class Student
{
	Student(int roll_no, String name)
	{
		System.out.println("Roll no : " + roll_no + ", Name : " + name);
	}
	Student(int roll_no, String name, int mark)
	{
		System.out.println("Roll no : " + roll_no + ", Name : " + name + ", Mark : " + mark);
	}
	Student(int roll_no, String name, int mark1, int mark2)
	{
		System.out.println("Roll no : " + roll_no + ", Name : " + name + ", Mark1 : " + mark1 + ", Mark2 : " + mark2);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"Mathu");
		Student s2=new Student(2,"Deepa",90);
		Student s3=new Student(3,"Ashvitha",96,95);
	}

}
