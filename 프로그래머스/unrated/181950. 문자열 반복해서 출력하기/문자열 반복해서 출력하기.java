import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n = sc.nextInt();
    int i;

    int length = str.length(); // str 길이
    if ((length >= 1 && length <= 10) && (n >= 1 && n <= 5)) {
      for (i = 0; i < n; i++) {
        System.out.print(str);
      }
    }
  }
}
