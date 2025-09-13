package JavaCountdownTimer;
import java.util.Scanner;
//import java.io.IOException;

public class CountdownTimer {

	public static void main(String[] args) {
		Scanner myCountdown = new Scanner(System.in); // created an object from imported class scanner
		// 'myCountdown', (System.in) allow for keyboard to be used
		
		System.out.print("Please input a number for countdown: "); // display text
		
		int number = myCountdown.nextInt(); // variable number takes in the integer (.nextInt()), that
		// is passed through object 'myCountdown'
		
		myCountdown.close(); // closed scanner
		
		try {// try - catch statement in place for errors
	// for loop to countdown number 
		for(int start = number; start >= 0; start = start - 1) {
			System.out.println(start); // display the countdown
			Thread.sleep(1000); // Delay for 1 second
		}
		
		}catch (Exception e){ // catches any errors
			
			System.out.println("Error please try again");// display text
			
		}

	}

}
