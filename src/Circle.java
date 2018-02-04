/**
 * 
 */
import java.util.Scanner;
/**
 * @author MaoGeng Lin
 *
 */
public class Circle {

	protected Point center;
	protected double radius;
	
	Circle(){
		center = new Point();
		radius = 0;
	}
	
	Circle(Point center, double radius){
		if(center != null) {
			this.center = center;
		}
		
		else{
			this.center = new Point();
		}
		
		if(radius >=0) {
			this.radius = radius;
		}
		
		else {
			this.radius = 0;
		}
	}
	
	public int relationCheck(Circle target) {
		if(target == null) {
			return 0;
		}
		
		double distance = getDis(target);
		double totalRadius = radius + target.radius;
		if(distance > totalRadius) {
			return 1;
		}
		
		if(distance == totalRadius) {
			return 2;
		}

		if( radius >= target.radius + distance || target.radius >= radius + distance) {
			return 3;		
		}
		
		return 4;
	}
	
	public double getDis(Circle target) {
		if(target != null) {
			return center.getDis(target.center);
		}
		
		else {
			return 0;
		}
	}
	
	public String toString() {
		return "center at " + center.toString() + " with radius of " + radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea(){
		return Math.PI * Math.pow(radius, 2); 
	}
	
	public boolean setCenter(Point center,Scanner userinput) {
		if(center != null) {
			this.center = center;
			return true;
		}
		
		if(userinput == null) {
			userinput = new Scanner(System.in);
		}

		if(this.center.setPoint(userinput) == false) {
			return false;
		}
		
		return true;
	}
	
	public boolean setRadius(Scanner userinput) {
		if (userinput == null) {
			userinput = new Scanner(System.in);
		}
	
		String invalidInput= " isn't a valid radius"+ "\n";
		System.out.println("Please enter the radius of this circle"); 		
		
		while(userinput.hasNext()) {

			if(userinput.hasNextDouble()) {
				radius = userinput.nextDouble();
				
				if(radius >= 0) {
					return true;
				}
				
				else {
					System.out.println(radius + invalidInput);
					radius = 0;
				}
			}
			
			else {
				System.out.println(userinput.next() + invalidInput);
			}

			System.out.println("Please enter the radius of this circle");
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userinput = new Scanner(System.in);
		Circle circle = new Circle();
		boolean looping;				//refer to https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
		
		do {
			looping = circle.setRadius(userinput);
			if(looping) {
				System.out.println("The circle with radius " + circle.getRadius() + " has area of " + circle.getArea() + "\n");
			}
		}while(looping);
		
		System.exit(0);
	}

}
