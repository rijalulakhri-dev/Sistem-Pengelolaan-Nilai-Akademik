import java.util.ArrayList;
import java.util.Scanner;

public class Dosen extends User {
    private String nip;
    private ArrayList<Mahasiswa> daftarMahasiswa;

   // Menerima dua parameter nip dan nama.
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
        this.daftarMahasiswa = new ArrayList<>();
    }

   // Menerima objek Mahasiswa sebagai parameter.
    public void tambahMahasiswa(Mahasiswa mhs) {
        this.daftarMahasiswa.add(mhs);
    }

    // Metode tambahNilaiMahasiswa(String nim, float nilai, int bobot):
    /* Menerima tiga parameter: nim (nomor induk mahasiswa), nilai, dan bobot.
       Melakukan iterasi melalui setiap objek Mahasiswa dalam daftarMahasiswa.
       Jika ditemukan objek Mahasiswa dengan nim yang cocok, memanggil metode setNilai pada objek Mahasiswa tersebut dengan parameter nilai dan bobot.
    */ 
    public void tambahNilaiMahasiswa(String nim, float nilai, int bobot) {
        for (Mahasiswa mhs : this.daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                mhs.setNilai(nilai, bobot);
                System.out.println("Nilai berhasil ditambahkan.");
                return;
            }
        }
        System.out.println("NIM " + nim + " tidak ditemukan.");
    }

    /*Metode lihatDaftarMahasiswa():
      Mencetak pesan "Daftar Mahasiswa:"
      Melakukan iterasi melalui setiap objek Mahasiswa dalam daftarMahasiswa.
      Untuk setiap objek Mahasiswa, mencetak nama dan nim menggunakan metode getNama() dan getNim().
    */
    public void lihatDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa: ");
        for (Mahasiswa mhs : this.daftarMahasiswa) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }

    /*Metode menu() (override dari metode superclass User):
      Membuat objek Scanner untuk menerima input pengguna.
      Membuat variabel choice untuk menyimpan pilihan menu yang dipilih.
      Membuat variabel exit dengan nilai awal false untuk mengontrol keluar dari menu.
      Melakukan loop while sampai exit bernilai true.
      Mencetak menu pilihan untuk dosen.
    */
    @Override
    public void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu Dosen");
            System.out.println("1. Tambah Nilai Mahasiswa");
            System.out.println("2. Lihat Daftar Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = input.next();
                    System.out.print("Masukkan Nilai: ");
                    float nilai = input.nextFloat();
                    System.out.print("Masukkan Bobot Nilai: ");
                    int bobot = input.nextInt();
                    this.tambahNilaiMahasiswa(nim, nilai, bobot);
                    break;
                case 2:
                    this.lihatDaftarMahasiswa();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        }
    }
}
