import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean test1 = x * x + y * y >= 4;
        boolean test2 = y <= x;
        boolean test3 = x <= 2 && x > 0 && y >= 0;
        
        System.out.println(test1 && test2 && test3 ? "YES" : "NO");
    }
}
