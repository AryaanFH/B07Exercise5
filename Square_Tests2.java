import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Square_Tests2{
	
	@Test
	void testPerimeter() {
		Point p1 = new Point(4,4);
		Point p2 = new Point(0,4);
		Point p3 = new Point(4,0);
		Point p4 = new Point(0,0);
		
		Square s1 = new Square(p1,p2,p3,p4);
		
		assertEquals(s1.perimeter(), 16.0);
		
	}	
	
	@Test
	void testArea() {
		Point p1 = new Point(4,4);
		Point p2 = new Point(0,4);
		Point p3 = new Point(4,0);
		Point p4 = new Point(0,0);
		
		Square s1 = new Square(p1,p2,p3,p4);
		
		assertEquals(s1.area(), 16.0);
		
	}
}