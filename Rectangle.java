package shape;

public class Rectangle implements Shape {
	public double length;
	public double width;
	
	
	public Rectangle(double len, double wid) {
		this.length = len;
		this.width = wid;
	}

	@Override
	public double getArea() {
		
		return length * width;
	}

	@Override
	public double getPerimeter() {
		double p = (2 * length) + (2 * width);
		return p;
	}
	

}
