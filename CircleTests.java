package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testConstructor() {
		Circle rad = new Circle(1);
		assertEquals(1, rad.radius);
	}
	
	@Test
	void testArea() {
		Circle rad = new Circle(1);
		assertEquals(Math.PI, rad.area());
	}
	
	@Test
	void testCircumference() {
		Circle rad = new Circle(1);
		double expected = 2 * Math.PI * rad.radius;
		assertEquals(expected, rad.circumference());
	}

}
