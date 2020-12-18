package chap1.strings.number.math;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		String str = "1234444";
		Boolean resultV1 = stringContainsOnlyDigitsV1(str);
		Boolean resultV2 = stringContainsOnlyDigitsV2(str);
		Boolean resultV3 = stringContainsOnlyDigitsV3(str);
		System.out.println("resultV1 : " + resultV1);
		System.out.println("resultV2 : " + resultV2);
		System.out.println("resultV3 : " + resultV3);
	}

	private static Boolean stringContainsOnlyDigitsV3(String str) {
		return !str.chars().anyMatch(n -> !Character.isDigit(n));
	}

	private static Boolean stringContainsOnlyDigitsV2(String str) {
		return str.matches("[0-9]+");
	}

	private static Boolean stringContainsOnlyDigitsV1(String str) {
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

}
