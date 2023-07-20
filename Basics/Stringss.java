import java.util.*;

public class Stringss {
    public static void main(String[] args){
        String s = "hello";

        // Identical strings share same memory ; == compares address
        String s1 = "hello";
        System.out.println(s == s1);

        Scanner scn = new Scanner(System.in);
        String s2 = scn.nextLine();

        System.out.println(s2);
        System.out.println(s2.length());

        // CharAt
        System.out.println(s2.charAt(0));
        // SubString
        System.out.println(s2.substring(2));
        // Concat
        System.out.println(s2.concat("random"));

        // Print all the substrings
        for(int i=0; i<s2.length(); i++){
            for(int j=i+1; j<=s2.length(); j++){
                System.out.println(s2.substring(i , j));
            }
        }

        // Split function
        String sa = "ab,bc,cd,ef,gh";
        String[] parts = sa.split(",");
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }

        // Add strings
        String se = "hello";
        se += 'w';
        se += 'o';
        se += 'r';
        se += 'd';
        se += 10;
        System.out.println(se);
        System.out.println(20 + 20 + "hello");
        System.out.println(10 + "hello" + 20);

        // Compare the addresses only
        System.out.println(s == s1);
        System.out.println(s == s2);

        // Compares address first and then char by char comparison
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s2));

        String sn = new String("hello");
        System.out.println(s == sn);
        System.out.println(s.equals(sn));

        scn.close();
    }
}
