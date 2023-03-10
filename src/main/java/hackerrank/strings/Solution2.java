package hackerrank.strings;

import java.util.*;

public class Solution2 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> myList = new ArrayList<>();

        for(int i=0; i<s.length()-k+1; i++){
            myList.add(s.substring(i,i+k));
        }
        Collections.sort(myList);
        smallest = myList.get(0);
        largest = myList.get(myList.size()-1);

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
