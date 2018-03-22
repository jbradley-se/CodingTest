package shapes;

public class Circle implements Shape {

	private double radius;

	public Circle(double r){
		this.radius = r;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI*radius;
	}
	
	// Driver method to test the above function
	 public static void main(String[] args) 
	 {
		Circle theCircle = new Circle(7);
		double area = theCircle.getArea();
		double perimeter = theCircle.getPerimeter();
	      
	     System.out.println(theCircle + " --> area:" + area + ", perimeter: " + perimeter);       
	 }
	
    
}
