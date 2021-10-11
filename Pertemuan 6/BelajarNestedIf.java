import java.util.Scanner;

public class BelajarNestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();
        if (umur <= 5 && umur >= 0) {
            System.out.print("Anda masih balita ");
            System.out.print("Masukkan umur orang tua Anda: ");
            int umurOrangTua = scanner.nextInt();
            if (umurOrangTua < 15) {
                System.out.print("Sebaiknya Anda meminta pengasuh anak");
            } else {
                System.out.print("Anda bisa mengasuh anak sendiri");
            }
        } else if (umur > 5 && umur <= 19) {
            System.out.print("Anda sudah remaja");
        } else if (umur > 19) {
            System.out.print("Anda sudah dewasa");
        } else {
            System.out.print("Umur Anda tidak valid");
        }
    }
}