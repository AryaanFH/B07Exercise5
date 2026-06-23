public class Square{
	Point a;
	Point b;
	Point c;
	Point d;
	
	public Square(Point a, Point b, Point c, Point d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double perimeter(Square q){
		double p = a.distance(b) + b.distance(c) + c.distance(d) + d.distance(a);
		return p;
	}
	
}