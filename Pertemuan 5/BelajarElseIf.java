import java.util.Scanner;

public class BelajarElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur Anda");
        int umur = scanner.nextInt();
        if (umur <= 5 && umur >= 0) {
            System.out.print("Anda masih balita");
        } else if (umur > 5 && umur >= 19) {
            System.out.print("Anda sudah remaja");
        } else if (umur > 19) {
            System.out.print("Anda sudah dewasa");
        } else if (umur > 100) {
            System.out.print("Anda panjang umur");
        } else {
            System.out.print("Umur Anda tidak valid");
        }
        System.out.println("Terima kasih. Semoga hari Anda menyenangkan!");
    }
}