import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 1 && n <= 1000) {
            if (n % 2 == 1) {
                System.out.printf("%d is odd", n);
            } else {
                System.out.printf("%d is even", n);
            }
        }
        sc.close ();
    }
}