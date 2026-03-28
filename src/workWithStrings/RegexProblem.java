package workWithStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {
	public static void main(String[] args) {

		String str = "AX-2345-RBL-1234";

		// Regex pattern
		String regex = "^AX-\\d{4}-[A-Za-z]{3}-\\d{4}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		if (matcher.matches()) {
			System.out.println("Valid format");
		} else {
			System.out.println("Invalid format");
		}
	}
}
