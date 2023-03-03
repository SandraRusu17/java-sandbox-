package hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {

    static boolean isAnagram(String c, String d) {
        String string1 = c.toLowerCase();
        String string2 = d.toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        }

        char[] a = string1.toCharArray();
        char[] b = string2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}