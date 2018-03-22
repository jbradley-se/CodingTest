package shapes;

public class Triangle implements Shape {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + "]";
	}

	/**
	 * @return the side1
	 */
	protected double getSide1() {
		return side1;
	}


	/**
	 * @param side1 the side1 to set
	 */
	protected void setSide1(double side1) {
		this.side1 = side1;
	}


	/**
	 * @return the side2
	 */
	protected double getSide2() {
		return side2;
	}


	/**
	 * @param side2 the side2 to set
	 */
	protected void setSide2(double side2) {
		this.side2 = side2;
	}


	/**
	 * @return the side3
	 */
	protected double getSide3() {
		return side3;
	}


	/**
	 * @param side3 the side3 to set
	 */
	protected void setSide3(double side3) {
		this.side3 = side3;
	}


	@Override
	public double getArea(){
		double p = getPerimeter() / 2;
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)) );
	
	}

	@Override
	public double getPerimeter() {
		
		return side1 + side2 + side3;
	}
	
	// Driver method to test the above function
	 public static void main(String[] args) 
	 {
		Triangle theTriangle = new Triangle(18, 28, 20);
		double area = theTriangle.getArea();
		double perimeter = theTriangle.getPerimeter();
	      
	     System.out.println(theTriangle + " --> area:" + area + ", perimeter: " + perimeter);       
	 }
	
    
}
