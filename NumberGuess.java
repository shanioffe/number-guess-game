/*
* Name: Shannon Ioffe
* Overview: Generates a random number within a certain range and prompts the user to guess it correctly.
* Input: User guesses until their answer is correct or ends the game.
* Output: Tells user if their guess is too high, too low, out of range, or correct.
* Variables: num, guess
*/

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		Random generator = new Random ();
		int num, guess=0;
		num = generator.nextInt(100); //generates a random number within the range
		
		System.out.println("Welcome to the number guessing game! Enter -1 to quit.");
		System.out.println("Guess the number: "); //prompts user to enter a guess
		Scanner scan = new Scanner(System.in);
		guess = scan.nextInt();
		
		while (guess != -1) { //demonstrates use of sentinel loop
		
			if(guess > 100 || guess < 1) {
				System.out.println("Error! Cannot accept values outside the range 1-100."); //sets up error checking to prevent user from entering numbers outside range
			}
			else {
				if (guess == num) {
					System.out.println("Congradulations! You guessed the correct number.");
				}
				else {
					if(guess > num) {
						System.out.println("That guess is too high. Guess again.");
					}
					else {
							System.out.println("That guess is too low. Guess again.");
					}
				}
			}
			guess = scan.nextInt();	//allows the user to guess again
		}
	}
}

		

