package shape;

public class Launch {
	
	public static void main(String args[]) {
		//Specs of Triangle
		double tbase = 12;
		double theight = 16;
		double a = 6;
		double c = 10;
		
		//Create new Triangle and pass values
		Triangle tri = new Triangle(theight, tbase, a, c);
		
		
		double tarea = tri.getArea();
		System.out.println("Area of triangle is " + tarea);
		double tper = tri.getPerimeter();
		System.out.println("Perimeter of triangle is " + tper);
		
		double r = 15;
		
		//New Circle with Radius of 15
		Circle myc = new Circle(r);
		
		double carea = myc.getArea();
		
		double cper = myc.getPerimeter();
		
		System.out.printf("Area of circle is %.2f\nPerim of circle is %.2f\n", carea, cper);
		
		
		double length = 16;
		
		double width = 20;
		
		Rectangle rec = new Rectangle(length, width);
		
		double rarea = rec.getArea();
		double rperim = rec.getPerimeter();
		
		System.out.println("Area of rectangle is " + rarea + " Perimeter of rectangle is " + rperim);
		
	
		
		
	}
	

}
