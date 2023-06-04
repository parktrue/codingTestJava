import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    int length = a.length();
    if (length >= 1 && length <= 20) {
      StringBuilder sb = new StringBuilder();
      for (char x : a.toCharArray()) {
        if (x >= 'A' && x <= 'Z') {
          sb.append((char) (x + 32));
        } else if (x >= 'a' && x <= 'z') {
          sb.append((char) (x - 32));
        } else {
          sb.append(x);
        }
      }
      System.out.println(sb.toString());
    }
    sc.close();
  }
}