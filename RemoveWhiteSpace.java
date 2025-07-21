import java.util.Scanner;

public class RemoveWhiteSpace {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your String to remove whitespaces");
    String text = sc.nextLine();
    sc.close();
    StringBuilder sb =new StringBuilder();
    for(char c: text.toCharArray()){
        if(c!=' '){
            sb.append(c);
        }
    }
    System.out.println("Whitespace Removed: "+sb.toString());
   } 
}
