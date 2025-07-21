import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to reverse: ");
		String text = sc.nextLine();
		sc.close();
		StringBuilder reversedStr = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--) {
			reversedStr.append(text.charAt(i));
		}
		System.out.println("original string: " + text);
		System.out.println("reversed string: " + reversedStr);
	}
}
