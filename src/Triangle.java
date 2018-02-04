import java.util.Scanner;

/**
 * 
 */

/**
 * @author MaoGeng Lin
 *
 */
public class Triangle {
	/**
	 * @param args
	 */
	protected Point[] point = new Point[3];
	protected double[] sides = new double[3];
	
	
	public Triangle(Point a, Point b, Point c) {
		
		point[0] = a;
		point[1] = b;
		point[2] = c;
		
		for(int i=0; i<=2; i++) {
			sides[i]=point[i].getDis(point[(i+1)%3]);
		}
	}
	
	public boolean isReal() {

		for (int i = 0; i<=2; i++) {
			if(sides[i]>=sides[(i+1)%3]+sides[(i+2)%3]) {
				return false;
			}
		}
		return true;
	}
	
	public void printSide() {
		System.out.println("The length of each side of this triangle are " + sides[0] + " " + sides[1] + " " + sides[2]);
	}
	
	public void printProperty() {
		
		if(this.isReal()) {
			System.out.println("This triangle is a real triangle.");
		}
		
		else {
			System.out.println("This triangle is a fake triangle.");
		}
	}
	
	public void print() {
		System.out.println("This triangle has coordinates " + toString());
		printSide();
		printProperty();
	}
	
	public String toString() {
		return point[0].toString() + point[1].toString() + point[2].toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  looping;
		Triangle triangle;
		Point pointSet[] = new Point [3];
		String 	prompt = "Please enter the coordinates for the triangle.",
				settingUp = "Please enter the coordinates for point #";
		Scanner userinput = new Scanner(System.in);
		
		do {
			System.out.print("\n" + prompt);
			looping = true;
			
			for(int i=0; i<=2; i++)	{
				System.out.println("\n"+ settingUp + (i+1));
				pointSet[i]= new Point();
				
				if(!pointSet[i].setPoint(userinput)) {
					looping = false;
					break;
				}
			}
			
			if(looping) {
				triangle = new Triangle(pointSet[0],pointSet[1],pointSet[2]);
				triangle.print();
			}
			
		}while(looping);
	}
}
