import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to remove duplicates: ");
        String word = sc.nextLine();
        sc.close();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result+=currentChar;
            }
        }
        System.out.println("Duplicates Char Removed: "+result);
    }
}
