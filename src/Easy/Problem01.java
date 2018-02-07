/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below N.
 * 
 * Input Format
 * First line contains T that denotes the number of test cases. This is followed by  lines, each containing an integer, N.
 * Constraints
 * 1<=T<=10^5
 * 1<=N<=10^9
 * 
 * Output Format
 * For each test case, print an integer that denotes the sum of all the multiples of  or  below .
 * 
 * Sample Input 0
 * 2
 * 10
 * 100
 * Sample Output 0
 * 
 * 23
 * 2318
 * 
 * 
 * Test case 2&3 Timed out
 */

package Easy;

import java.util.*;
import java.math.*;

public class Problem01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int sum = 0;
            for (int i = 1; i<n ; i++ ){
                if ((i%3 == 0) && (i%5 == 0)){
                    sum +=i;
                } else if ((i%5 == 0)||(i%3 == 0)) {
                    sum += i;
                } else {
                    // do nothing
                } 
            }
            System.out.println(sum);
        }
    }
}
