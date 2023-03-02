package hackerrank.eof;

import java.util.Scanner;

public class Solution {

    static int B;
    static int H;
    static boolean flag;


    static {
        flag = true;
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        try {
            if (B <= 0 || H <= 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e + ":" + "Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
