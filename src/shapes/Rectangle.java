package shapes;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	/**
	 * @return the length
	 */
	protected double getLength() {
		return length;
	}

	/**
	 * @return the width
	 */
	protected double getWidth() {
		return width;
	}


	@Override
	public double getArea(){
		return getLength() * getWidth() ;
	
	}

	@Override
	public double getPerimeter() {
		
		return 2*getLength() + 2*getWidth();
	}
	
	// Driver method to test the above function
	 public static void main(String[] args) 
	 {
		Rectangle theRectangle = new Rectangle(5, 15);
		double area = theRectangle.getArea();
		double perimeter = theRectangle.getPerimeter();
	      
	     System.out.println(theRectangle + " --> area:" + area + ", perimeter: " + perimeter);       
	 }
	
    
}
