public class Mahasiswa extends Manusia {
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;
    private int semester;

    public Mahasiswa(String nim, String nama, String alamat, double ipk, int semester) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return this.alamat;

    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;

    }
    
    public void getDetail() {
        if (ipk >= 3.51 && ipk <= 4.00) {   
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Summa cumlaude)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else if (ipk >= 3.51 && ipk < 4.00) {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Cumlaude)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else if (ipk >= 3.01 && ipk < 3.51) {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Sangat memuaskan)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Memuaskan)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Cukup)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else if (ipk < 2.00) {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Tidak Lulus)", this.tinggiBadan, this.semester);
            System.out.println();
        }
        else {
            System.out.printf("%5s %8s %8s %5s %7s %5s", this.nim, this.nama.toUpperCase(), this.alamat, this.ipk, "(Tidak Valid)", this.tinggiBadan, this.semester);
            System.out.println();
        }
    }

}