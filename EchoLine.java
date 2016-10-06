package learningJava;

import java.util.Scanner;

public class EchoLine {

	public static void main(String[] args) {
		Scanner echoThis = new Scanner(System.in);
		
		System.out.print(echoThis.nextLine());
		
		echoThis.close();

	}

}
