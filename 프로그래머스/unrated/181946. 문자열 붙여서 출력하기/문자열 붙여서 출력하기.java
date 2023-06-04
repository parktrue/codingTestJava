import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int alength = a.length();
        int blength = b.length();
        
        if (alength >= 1 && blength <= 10) {
            System.out.printf("%s%s", a, b);
        }
    }
}