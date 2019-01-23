package lab7;

import java.util.Scanner;

public class ThisIsALot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		String name = readName(scnr,"Enter your first name: ", 0, 30);
		System.out.println("Congratulations! You are " + name + "!");
		
		
		int two = readInt(scnr, "What is gravity?: ", 0.0, 10.0);
		System.out.println("YOU'RE GROUNDED!");
		
		scnr.close();
	}
	private static boolean valid(String input) {
        return (input.matches("[A-Z][a-zA-z]*"));
        }
    private static boolean validEmail(String input) {
        return (input.matches("[a-zA-Z$_0-9]{5,30}@[a-zA-Z]{5,10}.[a-zA-Z]{2,3}"));
    }
}
//	public static String readName(Scanner scnr, String prompt) {
//		String name = readName(scnr, prompt);
//		while (name < i || name > j) {
//			//invalid!!
//			System.out.println("The number must be in the range " + i + " to " + j + ". Try again.");
//			name = readString(scnr, prompt);
//		}
//		return name;
//	}
//	public static String readString(Scanner scnr, String prompt) {
//		System.out.println(prompt);
//		while (!scnr.hasNextLine()) {
//			scnr.next();//clears the scanner token
//			System.out.println("Invalid integer. Try again.");
//			System.out.println(prompt);
//		}
//		String email = scnr.toString();
//		scnr.nextLine();
//		return email;
//		
//	}
//	public static int readInt(Scanner scnr, String prompt) {
//		System.out.println(prompt);
//		while (!scnr.hasNextInt()) {
//			scnr.next();// clears the scanner token
//			System.out.println("Invalid integer. Try again.");
//			System.out.println(prompt);
//		}
//		int two = scnr.nextInt();
//		scnr.nextLine();
//		return two;
//	}
//
//	public static int readInt(Scanner scnr, String prompt, int min, int max) {
//		int two = readInt(scnr, prompt);
//		while (two < min || two > max) {
//			// invalid!!
//			System.out.println("The number must be in the range " + min + " to " + max + ". Try again.");
//			two = readInt(scnr, prompt);
//		}
//		return two;
//	}
}