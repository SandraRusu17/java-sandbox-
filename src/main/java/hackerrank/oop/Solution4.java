package hackerrank.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a.add(i);
            }
        }
        // ----version 1
        int sum2 = a.stream().mapToInt(Integer::valueOf).sum();
        return sum2;

        // ----version 2
//        int sum = 0;
//        for (int j = 0; j < a.size(); j++)
//            sum += a.get(j);
//        return sum;
    }
}

class Solution4 {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

