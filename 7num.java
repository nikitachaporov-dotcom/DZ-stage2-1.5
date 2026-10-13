import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        boolean test1 = x <= 1;
        boolean test2 = y >= 1 - x;
        boolean test3 = (x >= 0) || (y >= 2 * (x * x));
        
        System.out.println(test1 && test2 && test3 ? "YES" : "NO");
    }
}
