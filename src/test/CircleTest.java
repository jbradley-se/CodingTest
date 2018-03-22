/**
 * 
 */
package test;

import static org.junit.Assert.*;
import org.junit.Test;
import shapes.Circle;

/**
 * @author jcb
 *
 */
public class CircleTest {


	/**
	 * Test method for {@link org.examples.Circle#getArea()}.
	 */
	@Test
	public void testGetArea() {
		Circle theCircle = new Circle(7);
		double expectedResult = (153.93);
		double actualResult = theCircle.getArea();
		assertEquals("valueTest", expectedResult, actualResult, .01);
	}

	/**
	 * Test method for {@link org.examples.Circle#getPerimeter()}.
	 */
	@Test
	public void testGetPerimeter() {
		Circle theCircle = new Circle(7);
		double expectedResult = (43.98);
		double actualResult = theCircle.getPerimeter();
		assertEquals("valueTest", expectedResult, actualResult, .01);
	}

}
