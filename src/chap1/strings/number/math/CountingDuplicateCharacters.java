package chap1.strings.number.math;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Great responsibility".replaceAll(" ", "");
		countDuplicateCharactersV1(str);
		countDuplicateCharactersV2(str);
	}

	private static void countDuplicateCharactersV2(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.compute(c, (k, v) -> (v == null) ? 1 : ++v);
		}

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
//		System.out.println(Arrays.toString(map.entrySet().toArray()));
	}

	public static void countDuplicateCharactersV1(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		System.out.println();
	}
}
