package l6.one;

public class Utility {
	public static int countLetters(String str) {
		return str.length();
	}
	
	public static String reverseLetters(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + reverseLetters(str.substring(0, str.length() - 1));
		}
	}
	
	public static String removeDuplicates(String str) {
		if (str.length() <= 1) return str;
		
		if (str.substring(0, str.length() - 1).contains(str.substring(str.length() - 1))) {
			return removeDuplicates(str.substring(0, str.length() - 1));
		} else {
			return removeDuplicates(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1);
		}
	}
}
