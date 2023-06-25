import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int sum = 0;
        int minus = 0;
        int multiple = 0;
        int divide = 0;
        int mod = 0;
        
        sum = A + B;
        minus = A - B;
        multiple = A * B;
        divide = (int) (A / B);
        mod = A % B;
        
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(divide);
        System.out.println(mod);
        sc.close();
    }
}