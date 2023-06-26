import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buddaYear = sc.nextInt();
        int newYear = buddaYear - 543;
        
        System.out.println(newYear);
        
        sc.close();
    }
}