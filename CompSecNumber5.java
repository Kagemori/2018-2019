/*
 * Keith Estrella - 1013657
 * Computer Security Midterm
 * Question Number 5
 * Note: I used LocalDate which comes with Java 1.8+
 */

import java.time.LocalDate;
import java.util.Random;

public class CompSecNumber5 {
	public static void main(String[] args) {
		int counter = 0; // Counter for iterations
		int rng = 0; // Variable for the randomly generated number
		int date = 0; // Variable for the date
		Random rand = new Random(); // Created a RNG
		
		/* 
		 * This uses LocalData to obtain the current date, since LocalDate is an object I used
		 * the object's get functions to convert the date into an int for comparison to the RNG and converted
		 * it to the proper format the question asked
		 */
		LocalDate today = LocalDate.now();
		date = today.getDayOfMonth();
		date = (date*100) + today.getMonthValue();
		date = (date*10000) + today.getYear();
		
		// While loop counts and generates a new 8-digit number only stopping when rng matches the date
		while(rng != date) {
			rng = rand.nextInt(100000000) + 10000000;
			counter++;
			
			if(rng == date) {
				for(int i = 0; i < 5; i++) {
					System.out.println("Today is " + today + "!");
					System.out.println("The count is: " + counter);
				}
			}
		}
	}
}
