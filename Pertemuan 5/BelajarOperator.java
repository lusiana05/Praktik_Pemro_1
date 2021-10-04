import java.util.Scanner;

public class BelajarOperator {
    public static void main(String[] args) {
        boolean x = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan A = ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan bilangan B =");
        double b = scanner.nextDouble();
        System.out.println("A == B = " + (a == b));
        System.out.println("A != B = " + (a != b));
        System.out.println("A > B = " + (a > b));
        System.out.println("A < B = " + (a < b));
        System.out.println("A >= B = " + (a >= b));
        System.out.println("A <= B = " + (a <= b));
        boolean hasil = (a < 10 && b > 7);
        System.out.println("hasil A < 10 && B > 7 = " + hasil);
        System.out.println("hasil A < 10 || B > 7 = " + (a < 10 || b < 7));
        System.out.println("hasil !(A < 10 && B > 7 = " + !hasil);
    }
}