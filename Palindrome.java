import java.util.Scanner;

public class Palindrome {

	public String reverse(String original) {
		StringBuilder reversedStr = new StringBuilder();
		for (int i = original.length() - 1; i >= 0; i--) {
			reversedStr.append(original.charAt(i));
		}
		return reversedStr.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to check if it's palindrome :");
		String word = sc.nextLine();
		sc.close();
		Palindrome pl = new Palindrome();
		String reversedStr = pl.reverse(word);
		System.out.println(word.equals(reversedStr) ? "the word is palindrome" : "the word is not palindrome");
	}
}
