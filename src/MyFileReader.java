import java.util.Scanner;

/**
 * 
 */

/**
 * @author MaoGeng Lin
 *
 */
public class MyFileReader {

	/**
	 * 
	 */
	public static void main (String[] args) {
		
		Scanner userinput = new Scanner(System.in);				//refer to https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
		
		while(userinput.hasNext()) {
			
			if(userinput.hasNextDouble()) {
				System.out.println(userinput.nextDouble());
			}
			
			else {
				userinput.next(); //Throw any other non-number type
			}
		}
		System.exit(0);
	}

}
