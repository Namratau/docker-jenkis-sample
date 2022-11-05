package SimpleNumberPrograms;

import java.util.Scanner;

public class evenodd {

	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter the First integer Value: ");
		Number = sc.nextInt();
		
		evOrOd(Number);

	}	
	public static void evOrOd(int Number) {
		if (Number % 2 == 0) {
			System.out.println("\n You have entered EVEN Number");
		}
		else {
			System.out.println("\n You have entered ODD Number");
		}
	}
}