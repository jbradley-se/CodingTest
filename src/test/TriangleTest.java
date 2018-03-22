package test;

import static org.junit.Assert.*;
import org.junit.Test;
import shapes.Triangle;


public class TriangleTest {

	@Test
	public void testGetArea() {
		Triangle theTri = new Triangle(18, 28, 20);
		double expectedResult = (179.37);
		double actualResult = theTri.getArea();
		assertEquals("valueTest", expectedResult, actualResult, .11);
	}

	@Test
	public void testGetPerimeter() {
		Triangle theTri = new Triangle(18, 28, 20);
		double expectedResult = (66.0);
		double actualResult = theTri.getPerimeter();
		assertEquals("valueTest", expectedResult, actualResult, .11);
	}

}
