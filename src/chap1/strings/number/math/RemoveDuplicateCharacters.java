package chap1.strings.number.math;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	private static final String TEXT = "!ABCBA;CDE-DDDFA;";

	public static void main(String[] args) {
		removeDuplicateCharactersV1(TEXT);
		removeDuplicateCharactersV2(TEXT);
	}

	private static void removeDuplicateCharactersV2(String str) {
		StringBuilder sb = new StringBuilder();
		for(char c : str.toCharArray()) {
			if(sb.indexOf(String.valueOf(c)) == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

	private static void removeDuplicateCharactersV1(String str) {
		Set<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (set.add(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
