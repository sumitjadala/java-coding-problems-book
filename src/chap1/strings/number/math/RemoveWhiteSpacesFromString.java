package chap1.strings.number.math;

public class RemoveWhiteSpacesFromString {
	private static final String str = "lorem ipsum hello  world 		!";

	public static void main(String[] args) {
		System.out.println(str.replaceAll("\\s", ""));
	}

}
