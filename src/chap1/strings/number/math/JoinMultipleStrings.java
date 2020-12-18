package chap1.strings.number.math;

public class JoinMultipleStrings {
	private static final String STR1 = "hello1";
	private static final String STR2 = "hello2";
	private static final String STR3 = "hello3";
	private static final String STR4 = "hello4";
	private static final char DELIMTER = ' ';

	public static void main(String[] args) {
		joinMulipleStrings(DELIMTER, STR1, STR2, STR3, STR4);
		joinMulipleStrings(DELIMTER, STR1, STR2);
	}

	private static void joinMulipleStrings(char delimter, String... str) {
		StringBuilder sb = new StringBuilder();
		for (String s : str) {
			sb.append(s).append(delimter);
		}
		System.out.println(sb);
	}

}
