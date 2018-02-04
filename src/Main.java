import java.util.Scanner;

/**
 * 
 */

/**
 * @author MaoGeng Lin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle 	circleNumber[] = {	new Circle(),
									new Circle()};
		Scanner userinput = new Scanner(System.in);
		boolean nextStep;
		String[] relation = {	"Something wrong here!!!",
								"These two circles are separate from each other",
								"These two circles are touching from each other",
								"These two circles are completely within one another",
								"These two circles are overlapping from each other"};
		
			do {
				
				int i=0;
				do {
					nextStep = false;
					System.out.println(" \n "+ "Setting up the coordinate and radius for the circle #" + (i+1));
					
					if(circleNumber[i].setCenter(null,userinput) && circleNumber[i++].setRadius(userinput)) {
						nextStep = true;
					}
					
				}while(nextStep && i<=1);
				
				if(nextStep) {
					i = circleNumber[0].relationCheck(circleNumber[1]);
					System.out.println("The first circle is " + circleNumber[0]);
					System.out.println("The second circle is " + circleNumber[1]);
					System.out.println(relation[i] + "\n");
				}
				
			}while(nextStep);
			
			System.exit(0);	
	}


}
