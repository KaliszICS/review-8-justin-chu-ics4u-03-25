public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word) {
		String lowercase = word.toLowerCase();

		if (lowercase.endsWith("ife")) {
			return "ives";
		}

		else if (lowercase.endsWith("ey")) {
			return "eys";
		}

		else if (lowercase.endsWith("y")) {
			return "ies";	
		}

		else {
			return "s";
		}
	}

	public static int min(int a, int b, int c) {
		int smalboi = a;

		if (b < smalboi) {
			smalboi = b;
		}

		if (c < smalboi) {
			smalboi = c;
		}

		return smalboi;
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 ==0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

}
