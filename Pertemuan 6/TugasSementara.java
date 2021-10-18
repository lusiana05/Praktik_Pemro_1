import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Siakad UNY!");
        System.out.println(".: Program Siakad :.");
        System.out.println("1. Tambah Data ");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data ");
        System.out.println("4. Lihat Data");

        System.out.println("Menu yang Anda pilih =");
        int menu1 = scanner.nextInt();
        if (menu1 == 1) {
            System.out.println();
            System.out.println("----- Tambah Data -----");
            System.out.println();

            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata Kuliah");
            System.out.println("3. Kembali");
            System.out.println();

            System.out.print("Masukkan nama Mahasiswa :");
            String namaMahasiswa = scanner.nextLine();
            System.out.println("Mahasiswa yang Anda tambah adalah " + namaMahasiswa);

        } else if (menu1 == 2) {
            System.out.println();
            System.out.println("2. Tambah Data Mata Kuliah");
            System.out.println();

            System.out.print("Masukkan nama mata kuliah :");
            String namaMataKuliah = scanner.nextLine();
            System.out.println("Mata kuliah yang Anda tambah adalah " + namaMataKuliah);

        } else if (menu1 == 3) {
            System.out.println();
            System.out.println("------- Terimakasih -------");
        } else {
            System.out.println("Menu tidak ada");
        }

    }
}