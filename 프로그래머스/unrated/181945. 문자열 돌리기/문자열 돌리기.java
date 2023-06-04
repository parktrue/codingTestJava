import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

    int length = a.length();
    if (length >= 1 && length <= 10) {
      for (char x : a.toCharArray()) {
        System.out.printf("%c\n", x);
      }
    }
    sc.close();
  }
}
