package chap1.strings.number.math;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReversingLettersAndWords {
	private static final Pattern PATTERN = Pattern.compile(" +");
	private static final String WHITESPACE = " ";
	private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
			+ "showed me that anything is possible and that you're never too young to think big. "
			+ "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
			+ "or Fermilab. After graduating, I attended Stanford for a degree in economics and " 
			+ "computer science.";

	public static void main(String[] args) {
		String[] strArr = TEXT.split(WHITESPACE);
		reversingLettersAndWordsInStringV1(strArr);
		reversingLettersAndWordsInStringV2(TEXT);
	}

	private static void reversingLettersAndWordsInStringV1(String[] strArr) {
		long startTimeV1 = System.nanoTime();
		StringBuilder finalString = new StringBuilder();
		for (String s : strArr) {
			finalString.append(new StringBuilder(s).reverse() + WHITESPACE);
		}
		System.out.println(finalString.toString());
		displayExecutionTime(System.nanoTime() - startTimeV1);
	}

	private static void reversingLettersAndWordsInStringV2(String strArr) {
		long startTimeV2 = System.nanoTime();
		String reversedStr = PATTERN.splitAsStream(strArr).map(w -> new StringBuilder(w).reverse())
				.collect(Collectors.joining(WHITESPACE));
		System.out.println(reversedStr);
		displayExecutionTime(System.nanoTime() - startTimeV2);

	}

	private static void displayExecutionTime(long time) {
		System.out.println("Execution time: " + time + " ns" + " ("
				+ TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
	}
}
