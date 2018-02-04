/**
 * 
 */

/**
 * @author MaoGeng Lin
 *
 */
public class Line {

	protected Point a,b;
	
	public Line(Point a, Point b){
		this.a = a;
		this.b = b;
	}
	/*
	static double findLength(Point first, Point second) {
		return Math.hypot(first.getX()-second.getX(),first.getY()-second.getY());
	}
	
	public double getLength() {
		return Math.hypot(a.getX()-b.getX(),a.getY()-b.getY());
	}*/
}
