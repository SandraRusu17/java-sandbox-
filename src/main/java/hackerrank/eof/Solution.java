package hackerrank.eof;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.*/
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}