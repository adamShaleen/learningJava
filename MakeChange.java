package learningJava;

import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int quarters, dimes, nickels, cents, whatsLeft, total;
		
		System.out.println("How many cents do you have? ");
		total = keyboard.nextInt();
		
		quarters = total / 25;
		whatsLeft = total % 25;
		
		dimes = whatsLeft / 10;
		whatsLeft = whatsLeft % 10;
		
		nickels = whatsLeft / 5;
		whatsLeft = whatsLeft % 5;
		
		cents = whatsLeft;
		
		System.out.println();
		System.out.println("From " + total + " cents you get");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(cents + " cents");
		
		keyboard.close();
	}

}
