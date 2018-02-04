import java.util.Scanner;

/**
 * 
 */

/**
 * @author MaoGeng Lin
 *
 */
public class Point {

	protected double x,y;
	
	
	public Point() {
		x=y=0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
		
	public double getDis(Point target) {
		return Math.hypot(this.x-target.x,this.y-target.y);
	}
	
	public String toString(){

		return "(" + x + "," + y +")";
	}
	public boolean setPoint(Scanner userinput) {

		if(userinput == null) {
			userinput = new Scanner(System.in);		
		}
		
		String 	promptX = "Please enter the x value for this coordinate.",
				promptY = "Please enter the y value for this coordinate.",
				invalidInput = " isn't a valid input"+ "\n";
		
		System.out.println(promptX);
		
		while(userinput.hasNext()) {

			if(userinput.hasNextDouble()) {
				x = userinput.nextDouble();
				System.out.println(promptY);
				
				while(userinput.hasNext()) {
		
					if(userinput.hasNextDouble()) {
						y = userinput.nextDouble();
						return true;
					}
					
					else {
						System.out.println(userinput.next() + invalidInput);
						System.out.println(promptY);
					}
				}
				return false;
			}
			
			else {
					System.out.println(userinput.next() + invalidInput);
					System.out.println(promptX);
			}
	
		}
		return false;
	}
}
