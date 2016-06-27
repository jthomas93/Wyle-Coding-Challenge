package shape;

public class Circle implements Shape {
	
	double radius;


	
	
	public Circle(double r) {
		this.radius = r;
	}
	
	
	public double getArea() {
		double ar = (Math.PI) * (radius * radius);
		return ar;
	}

	
	public double getPerimeter() {
		
		double per = 2 *(Math.PI) * (radius);
		return per;
	}

}
