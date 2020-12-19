package chap1.strings.number.math;

public class IsPalindrome {

	private static final String STR1 = "dad";
	private static final String STR2 = "aibohphobia";

	public static void main(String[] args) {
		boolean resultV1 = isPalindromeV1(STR1);
//		boolean resultV2 = isPalindromeV2(STR1);
		if(resultV1) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}
	}

	private static boolean isPalindromeV2(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (right > left) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean isPalindromeV1(String str) {
		return str.equals(new StringBuilder(STR2).reverse().toString());
	}

}
