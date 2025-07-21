import java.util.Scanner;

public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to count letters: ");
        String word = sc.nextLine().toLowerCase();
        sc.close();
        int[] count = new int[26];
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + count[i]);
            }
        }
    }
}