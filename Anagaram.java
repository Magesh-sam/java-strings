import java.util.Scanner;

public class Anagaram {
    public static boolean checkAnagaram(String s1,String s2){
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        if (s1.length() != s2.length()) {
            return false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                count1[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s2.length(); i++) {
                count2[s2.charAt(i) - 'a']++;
            }
            for (int i = 0; i < count1.length; i++) {
                if (count1[i] != count2[i]) {
                    return false;
                }
            }
            return true;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();
        sc.close();
        boolean isAnagram  = checkAnagaram(s1, s2);
        if(isAnagram)
            System.out.println("It's an Anagram");
        else
            System.out.println("It's not an Anagram");
        
    }
}
