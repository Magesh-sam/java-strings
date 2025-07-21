import java.util.Arrays;

public class MyString {
    public static void main(String[] args) {
        String name = "mageshkannan";
        System.out.println("String.length()");
        System.out.println(name + " length is " + name.length());
        System.out.println("String.charAt(int index)");
        System.out.println("char ar index 3 is " + name.charAt(3));
        System.out.println("String.substring(int begin)");
        System.out.println("substring from index 4 is " + name.substring(4));
        System.out.println("String.substring(int begin,int end)");
        System.out.println("substring from index 4 is " + name.substring(4, 8));
        System.out.println("String.indexof(String s)");
        System.out.println("index of h is " + name.indexOf("h"));
        System.out.println("String.lastIndexof(String s)");
        System.out.println("last index of a is " + name.lastIndexOf("a"));
        System.out.println("String.toLowerCase()");
        System.out.println("lowercase name :" + name.toLowerCase());
        System.out.println("String.toUpperase()");
        System.out.println("uppsercase name :" + name.toUpperCase());
        name = "   hello world   ";
        System.out.println("String.trim()");
        System.out.println("original name is "+name);
        System.out.println("trimmed name is "+name.trim());
        System.out.println("String.replace(char a, char b)");
        System.out.println("treplace a with x"+name.replace("o","x"));
        System.out.println("String.equals(Obj obj)");
        name = "magesh";
        System.out.println("is "+name+" equal to"+" sam :"+name.equals("sam"));
        System.out.println("String.contains(charSequence)");
        System.out.println("does "+name+" contains age "+name.contains("age"));
        System.out.println("String.split(String regex)");
        name = "magesh kannan";
        String[] spiltWords = name.split(" ");
        System.out.println("splited array "+Arrays.toString(spiltWords));
        System.out.println("String.startsWith(String s)");
        System.out.println(name + " starts with ma :"+name.startsWith("ma"));
        System.out.println("String.endsWith(String s)");
        System.out.println(name + " ends with an :"+name.endsWith("an"));
        System.out.println("String.isEmpty()");
        System.out.println("is "+name+" empty? "+name.isEmpty());
        System.out.println("String.concat(String): " +name.concat(" Annathurai"));
        System.out.println("String.toCharArray(): " +Arrays.toString(name.toCharArray()));
        System.out.println("Interning string created with new keyword");
        String msg = new String("Hello").intern();
        System.out.println("Interned String "+msg);
    }
}