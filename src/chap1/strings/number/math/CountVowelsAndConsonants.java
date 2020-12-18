package chap1.strings.number.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {
	private static final Set<Character> vowelList = new HashSet<>(Arrays.asList('a', 'i', 'e', 'o', 'u'));

	public static void main(String[] args) {
		String str = "This is a really simple sentence".toLowerCase();
		countVowelsAndConsonantsV1(str);
	}

	private static void countVowelsAndConsonantsV1(String str) {
		Integer consonantsCount = 0;
		Integer vowelsCount = 0;
		for (char c : str.toCharArray()) {
			if (vowelList.contains(c)) {
				vowelsCount++;
			} else if ((c >= 'a' && c <= 'z')) {
				consonantsCount++;
			}
		}
		System.out.println("Vowel Count : " + vowelsCount + " Consonant Count : " + consonantsCount);
	}

}
