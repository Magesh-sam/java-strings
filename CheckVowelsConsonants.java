import java.util.Scanner;

public class CheckVowelsConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string");
        String text = sc.nextLine().toLowerCase().trim();
        sc.close();
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u')
                vowelsCount++;
            else
                consonantsCount++;
        }
        System.out.println("Vowels Count: " + vowelsCount);
        System.out.println("Consonants Count: " + consonantsCount);
    }
}