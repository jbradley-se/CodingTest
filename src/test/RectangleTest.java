package test;

import static org.junit.Assert.*;
import org.junit.Test;

import shapes.Rectangle;

public class RectangleTest {

	@Test
	public void testGetArea() {
		Rectangle theRec = new Rectangle(5, 15);
		double expectedResult = (75.0);
		double actualResult = theRec.getArea();
		assertEquals("valueTest", expectedResult, actualResult, .01);
	}

	@Test
	public void testGetPerimeter() {
		Rectangle theRec = new Rectangle(5, 15);
		double expectedResult = (40.0);
		double actualResult = theRec.getPerimeter();
		assertEquals("valueTest", expectedResult, actualResult, .01);
	}

}
