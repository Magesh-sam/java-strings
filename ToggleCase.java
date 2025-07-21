import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to toggle case: ");
        String word = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Character.toUpperCase(c));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println("Original String: " + word);
        System.out.println("Modified String: " + sb.toString());
    }
}
