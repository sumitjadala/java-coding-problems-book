package chap1.strings.number.math;

public class CountOccurencesOfCharacter {

	private static final String TEXT = "This is string";
	private static final char CHAR_TO_COUNT = 's';

	public static void main(String[] args) {
		countOccurencesOfCharacter(TEXT, CHAR_TO_COUNT);
	}

	private static void countOccurencesOfCharacter(String text, char charToCount) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == charToCount) {
				count++;
			}
		}

		System.out.println("Occurence of " + charToCount + " : " + count);
	}
}
