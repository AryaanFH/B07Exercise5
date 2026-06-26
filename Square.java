public class Square{
	Point a;//top right point
	Point b;//top left point
	Point c;//bottom right point
	Point d;// bottom left point
	
	// the distance between a and b must be the same as distance between c and d 
	//same for distance between d and b being equal to dist between a and c
	
	public Square(Point a, Point b, Point c, Point d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double perimeter(){
		//adjusted this, as the the wrong distances were being used before
		double p = a.distance(b) + b.distance(d) + d.distance(c) + c.distance(a);
		return p;
	}
	
	public double area(){
		//updated to remove the errors my ide was showing
		double myArea;
		myArea = a.distance(b) * a.distance(b);
		return myArea;
	}
}
