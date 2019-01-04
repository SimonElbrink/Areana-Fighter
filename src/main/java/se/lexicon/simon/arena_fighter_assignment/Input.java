package se.lexicon.simon.arena_fighter_assignment;

import java.util.Scanner;

public class Input {

public static Scanner scanner = new Scanner(System.in);
	
	public static String getStringFromUser () {
		return scanner.nextLine();
	}
	
	public static double getInterger() {
		boolean valid = false;
		double number = 0;
		while(!valid) {
			try {
				number = Integer.parseInt(getStringFromUser());
				valid = true;				
			}catch(NumberFormatException e) {
				System.out.println("Input was not a number");
			}
		}
		return number;
	}
	
}
