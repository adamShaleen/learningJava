package vowelFinder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelFinder {
	static int vowelCount = 0;
	
	public static int getVowelCount(String str) {
		
		if (str.length() > 0) {
		
			Pattern vowelFinder = Pattern.compile("[aeiou]");
			Matcher vowelMatcher = vowelFinder.matcher(str);
		
			while (vowelMatcher.find()) {
				vowelCount++;
				System.out.println("VowelCount = " + vowelCount);
			}
		}
		return vowelCount;		// why isn't this returning?
	}
}
