package hackerrank.strings;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
                numTokens++;
            }
        }
        System.out.println(numTokens);

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0) {
                System.out.println(str[i]);
            }
        }

        scan.close();
    }
}
