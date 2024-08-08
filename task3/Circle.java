package task3;

public class Circle {

	
	private float radius;
	private String color;
	
	
	public Circle(float radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	public void Simple()
	{
		System.out.println("radius = " + this.radius);
		System.out.println("Color = " + this.color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(1,"red");
		c.Simple();
	}

}
