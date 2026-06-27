import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquareTest {
	
	@Test
    void testSquareConstructorA() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(a, s.a);
    }
    
	@Test
    void testSquareConstructorB() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(b, s.b);
    }
	
	@Test
    void testSquareConstructorC() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(c, s.c);
    }
	
	@Test
    void testSquareConstructorD() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(d, s.d);
    }
	
    @Test
    public void testPerimeter() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(4.0, s.perimeter());
    }
    
    @Test
    public void testArea() {
    	Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 1);
        Point d = new Point(0, 1);
        Square s = new Square(a, b, c, d);
        assertEquals(1.0, s.area());
    }
}