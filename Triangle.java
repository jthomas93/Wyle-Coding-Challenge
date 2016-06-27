package shape;

public class Triangle implements Shape{
	
	public double height;
	public double a;
	public double base;
	public double c;
	
	
	public Triangle(double h, double bse, double s1, double s2) {
		this.height = h;
		this.base = bse;
		this.a = s1;
		this.c = s2;
		
	}
	
	
	public double getArea() {
		double ar = (base * height) / (2);
	    return ar;
	    
	
	}



	public double getPerimeter() {
	
		return a + base + c;
	}
	
	
	 

}
