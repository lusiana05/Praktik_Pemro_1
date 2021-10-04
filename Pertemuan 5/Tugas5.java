import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Sistem Informasi Akademik UNY!");
        System.out.println("Silakan masukkan nama lengkap, NIM, dan IPK");

        System.out.print("Masukkan nama lengkap Anda: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan NIM Anda : ");
        int NIM = scanner.nextInt();

        System.out.print("Masukkan IPK Anda: ");
        double ipk = scanner.nextDouble();

        System.out.print("Masukkan lama studi (dalam tahun): ");
        int lamaStudi = scanner.nextInt();

        System.out.println("------------------------------------------------------");
        System.out.println("     Pengumuman Hasil Capaian Studi Mahasiswa UNY     ");
        System.out.println("------------------------------------------------------");
        System.out.println("Nama lengkap : " + namaLengkap);
        System.out.println("NIM : " + NIM);
        System.out.println("IPK  : " + ipk);
        System.out.println("Lama studi : " + lamaStudi);

        if (ipk >= 3.51 && ipk <= 4.00 && lamaStudi <= 4) {
            System.out.println("Selamat atas kelulusan Anda dengan predikat Summa Cumlaude!");
        } else if (ipk >= 3.51 && ipk < 4.00) {
            System.out.println("Selamat atas kelulusan Anda dengan predikat Cumlaude!");
        } else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.println("Selamat atas kelulusan Anda dengan predikat Sangat Memuaskan!");
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Selamat atas kelulusan Anda dengan predikat Memuaskan!");
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Selamat atas kelulusan Anda dengan predikat Cukup!");
        } else if (ipk < 2.00) {
            System.out.println("Kami ucapkan permohonan maaf karena Anda dinyatakan Tidak Lulus");
            System.out.println("Tetap semangat dan jangan putus asa!");
        } else {
            System.out.println("Tidak Valid. Mohon cek dan masukkan data Anda dengan benar");
        }
        System.out.println("Terima kasih. Semoga hari Anda menyenangkan!");
        System.out.println();
    }
}