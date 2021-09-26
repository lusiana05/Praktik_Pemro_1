import java.util.Scanner;

public class Cobainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("      Riwayat kesehatan Mahasiswa Baru UNY 2021       ");
        System.out.println("------------------------------------------------------");

        System.out.print("Masukkan nama lengkap Anda:");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan nama panggilan Anda:");
        String namaPanggilan = scanner.nextLine();

        System.out.print("Masukkan alamat Anda:");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin Anda:");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Masukkan golongan darah Anda:");
        String golDarah = scanner.nextLine();

        System.out.print("Masukkan riwayat penyakit Anda:");
        String riwayatPenyakit = scanner.nextLine();

        System.out.print("Masukkan pantangan makanan Anda:");
        String pantanganMakanan = scanner.nextLine();

        System.out.print("Masukkan umur Anda:");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi badan Anda:");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Masukkan berat badan Anda:");
        double beratBadan = scanner.nextDouble();

        System.out.println("Nama lengkap Anda adalah " + namaLengkap);
        System.out.println("Nama panggilan Anda adalah " + namaPanggilan);
        System.out.println("Masukkan alamat Anda:");
        System.out.println("Jenis kelamin Anda adalah " + jenisKelamin);
        System.out.println("Golongan darah Anda adalah " + golDarah);
        System.out.println("Riwayat penyakit Anda adalah " + riwayatPenyakit);
        System.out.println("Pantangan makanan Anda adalah " + pantanganMakanan);
        System.out.println("Umur Anda adalah " + umur);
        System.out.println("Tinggi badan Anda adalah " + tinggiBadan);
        System.out.println("Berat badan Anda adalah " + beratBadan);
    }
}