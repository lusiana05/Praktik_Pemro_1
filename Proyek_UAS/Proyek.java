import java.util.Scanner;

public class Proyek {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    
    int jumlahData = 0;
    public static void main(String[] args) {
        Proyek siakad = new Proyek();
        int menu = 0;
        while (menu!=7) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariData();
            } else if (menu==4) {
                siakad.rerataIPK();
            } else if (menu==5) {
                siakad.hapusNIM();
            } else if (menu==6) {
                siakad.editData();
            }
        }
    }

    public static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Selamat Datang di Sistem Informasi Akademik UNY!");
        System.out.println("--------------------------------------");
        System.out.println("                 MENU                 ");
        System.out.println("--------------------------------------");
        System.out.println("1. Lihat data");
        System.out.println("2. Tambah data");
        System.out.println("3. Cari data");
        System.out.println("4. Rerata IPK");
        System.out.println("5. Hapus NIM");
        System.out.println("6. Edit Data");
        System.out.println("7. Keluar");
        System.out.println("Silakan pilih menu");
        int menu = scan.nextInt();
        return menu;   
    }


    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Data kosong");
        } else {
            System.out.println("Data tersedia");
            for (int i=0; i<jumlahData;i++) {
                this.mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukan alamat mahasiswa = ");
        String alamat = scan.nextLine();
        double ipk = 0;
        double tinggi = 0;
        try {
            System.out.print("Masukan IPK mahasiswa = ");
            ipk = scan.nextDouble();
            System.out.print("Masukan Tinggi Badan mahasiswa = ");
            tinggi = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK atau tinggi anda setelah input data");
        }
        System.out.print("Masukan semester mahasiswa = ");
        int semester = scan.nextInt();
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, alamat, ipk, semester);
        inputMahasiswa.setTinggiBadan(tinggi);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang Anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public void cariDataByNama() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa yang akan Anda cari: ");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index==-1) {
            System.out.println("Nama yang Anda cari tidak ditemukan");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }
    public int getIndexByNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }

    public void hapusNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hapus NIM mahasiswa dari data yang akan Anda hapus: ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Data yang akan Anda hapus tidak ditemukan: ");
        } 
        else {
            System.out.println("Anda yakin ingin menghapus?"); 
            System.out.println("Jika iya, masukkan angka 1");
            System.out.println("Jika tidak, masukkan angka 0");

            for (int i=index; i<jumlahData; i++) {
                int konfirmasi = scan.nextInt();
                if (konfirmasi==1) {
                    mahasiswa[i] = mahasiswa[i+1];
                    jumlahData--;
                    System.out.println("Data berhasil terhapus");
                    lihatData();
                } else if (konfirmasi==0) {
                    System.out.println("Data tidak terhapus");
                    lihatData();
                }
            }
        }
    }
//step 1: select data pake NIM
//step 2: cek kondisi ada/tidak
//step 3: saat data ada, pilih edit apa
//step 4: buat method pilih edit apa
//step 5: dalam pilih edit apa, gunakan while
    public void editData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih data yang akan diedit menggunakan NIM:");
        String selectNIM = scan.nextLine();
        int indexNim = getIndexByNIM(selectNIM);

        if (indexNim==-1) {
            System.out.println("Nama yang Anda akan edit tidak ditemukan");
        } else {
            System.out.println("Data ter-select");
            mahasiswa[indexNim].getDetail();
            System.out.println("Pilih data apa yang akan Anda edit:");
            System.out.println("1. Nama");
            System.out.println("2. NIM");
            System.out.println("3. Alamat");
            System.out.println("4. IPK");
            System.out.println("5. Tinggi badan");
            System.out.println("6. Semester");
            int menuEdit = scan.nextInt();

            if (menuEdit==1) {
                editNama(indexNim);
            } else if (menuEdit==2) {
                editNIM(indexNim);
            } else if (menuEdit==3) {
                editAlamat(indexNim);
            } else if (menuEdit==4) {
                editIPK(indexNim);
            } else if (menuEdit==5) {
                editTinggiBadan(indexNim);
            } else if (menuEdit==6) {
                editSemester(indexNim);
            }   
        }    
    }

    public void cariData() {
        System.out.println("Cari data dengan:");
        System.out.println("1. Nama");
        System.out.println("2. NIM");
        Scanner scan = new Scanner(System.in);
        int menuCari = scan.nextInt();
        if (menuCari==1) {
            cariDataByNama();
        } else if (menuCari==2) {
            cariDataByNIM();
        }
    }
    
    public void editNama(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nama mahasiswa yang baru = ");
        String Nama = scan.nextLine();
        mahasiswa[index].setNama(Nama);
        System.out.println("Data nama berhasil diedit");
        mahasiswa[index].getDetail();
    }  

    public void editNIM(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang baru = ");
        String nim = scan.nextLine();
        mahasiswa[index].setNIM(nim);
        System.out.println("Data NIM berhasil diedit");
        mahasiswa[index].getDetail();
    }

    public void editAlamat(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan alamat mahasiswa yang baru = ");
        String alamat = scan.nextLine();
        mahasiswa[index].setAlamat(alamat);
        System.out.println("Data alamat berhasil diedit");
        mahasiswa[index].getDetail();
    }

    public void editIPK(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan IPK mahasiswa yang baru = ");
        double ipk = scan.nextDouble();
        mahasiswa[index].setIPK(ipk);
        System.out.println("Data IPK berhasil diedit");
        mahasiswa[index].getDetail();
    }

    public void editTinggiBadan(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan tinggi badan mahasiswa yang baru = ");
        double tinggiBadan = scan.nextDouble();
        mahasiswa[index].setTinggiBadan(tinggiBadan);
        System.out.println("Data tinggi badan berhasil diedit");
        mahasiswa[index].getDetail();
    }

    public void editSemester(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan semester mahasiswa yang baru = ");
        int semester = scan.nextInt();
        mahasiswa[index].setSemester(semester);
        System.out.println("Data semester berhasil diedit");
        mahasiswa[index].getDetail();
    }
}