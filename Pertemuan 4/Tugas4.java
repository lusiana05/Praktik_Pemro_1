import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("                Latihan Operator Java                 ");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan nilai a:");
        double a = scanner.nextDouble();
        System.out.print("Masukan nilai b = ");
        double b = scanner.nextDouble();
        System.out.print("Masukan nilai c = ");
        double c = scanner.nextDouble();
        System.out.print("Masukan nilai d = ");
        double d = scanner.nextDouble();
        System.out.print("Masukan nilai e = ");
        double e = scanner.nextDouble();
        double hasil1 = a + b;
        double hasil2 = a - b;
        double hasil3 = a / b;
        double hasil4 = a % b;
        double hasil5 = a * b + c * d % e;
        double hasil6 = a % b + c / d % e - a % (b % c);
        double hasil7 = a + b + c + d + e * d + c + (b + a);

        System.out.println("                     Chapter 1                          ");
        System.out.println("Hasil dari a + b adalah " + hasil1);
        System.out.println("Hasil dari a - b adalah " + hasil2);
        System.out.println("Hasil dari a / b adalah " + hasil3);
        System.out.println("Hasil dari a % b adalah " + hasil4);
        System.out.println();
        System.out.println("                     Chapter 2                          ");
        System.out.println("Hasil dari a * b + c * d % e adalah " + hasil5);
        System.out.println("Hasil dari a % b + c / d % e - a % (b % c) adalah " + hasil6);
        System.out.println("Hasil dari a + b + c + d + e * d + c + (b + a) adalah " + hasil7);
        System.out.println();
    }
}