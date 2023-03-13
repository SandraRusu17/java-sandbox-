package hackerrank.exceptionhandling;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println(e);

        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
