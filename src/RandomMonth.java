import java.util.Random;

/**
 * 
 */
/**
 * @author MaoGeng Lin
 *
 */
public class RandomMonth {

	/**
	 * 
	 */	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();
		int month = generator.nextInt(12);
		String[] nameOfMonth = {"January", 
								"February", 
								"March", 
								"April", 
								"May", 
								"June", 
								"July", 
								"August", 
								"September", 
								"October", 
								"November", 
								"December"};
		
		System.out.println("The integer you get is " + (month+1) + " and the name of this month is " + nameOfMonth[month]);
		System.exit(0);
	}
}
