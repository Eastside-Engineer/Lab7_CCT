package lab7;

import java.util.Scanner;

public class ThisIsALot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		String nameValid = " ";
//		String email = " ";

		System.out.println("Enter a name: ");
		nameValid = scnr.next();
		
		System.out.println(nameValid);
//		
//		do {
//			name = scnr.nextLine();
//			//Valid Java identifier: [a-zA-Z_$][\w$]
//			boolean valid = name.matches("([A-Z][A-Za-z])+");
//			System.out.println(valid ? "Valid!" : "Invalid :(");
//			
//		}while (!name.isEmpty());
//		System.out.println("Thanks for playing.");
//		
		scnr.close();
	}

	private static void nameValid(String nameValid) {
		boolean valid = nameValid.matches("([A-Z]{1}[a-z]+\\s*([A-Z]{1}[a-z]+)*){1,30}");
		System.out.println(valid ? "Valid!" : "Invalid :(");
		
	}
		

//	private static boolean emailValid(String email) {
//			if (i%3 == 0) {
//				return true;
//			}else {
//				return false;
//			}
//	}
//	private static boolean phoneValid(int i) {
//				if (i%3 == 0) {
//					return true;
//				}else {
//					return false;
//				}
//	}
//	private static boolean dateValid(int i) {
//					if (i%3 == 0) {
//						return true;
//					}else {
//						return false;
//					}
	}
	
