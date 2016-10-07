package learningJava;

public class KeepingKidsQuiet {
	
	static int output;
	
	public static void main(String[] args) {
		output(30, 4);
	}

	public static void output(int gumballs, int kids) {
		output = gumballs / kids;
		System.out.print("Each kid gets " + output + " gumballs.");
	}
}
