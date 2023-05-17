import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("001", "Rizky", 2020);
        Mahasiswa mahasiswa2 = new Mahasiswa("002", "Nabila", 2020);
        Mahasiswa mahasiswa3 = new Mahasiswa("003", "Aulia", 2021);

        // Membuat objek dosen dan menambahkan mahasiswa ke dalam objek dosen
        Dosen dosen = new Dosen("001", "Wahyu");
        dosen.tambahMahasiswa(mahasiswa1);
        dosen.tambahMahasiswa(mahasiswa2);
        dosen.tambahMahasiswa(mahasiswa3);

        // Membuat variabel exit yang bernilai false
        boolean exit = false;

        // Membuat perulangan while yang akan berjalan selama variabel exit bernilai false
        while (!exit) {
            // Membuat objek scanner untuk membaca input dari pengguna
            Scanner input = new Scanner(System.in);

            // Menampilkan menu pada program
            System.out.println("\n==== Aplikasi Perekaman Nilai Mahasiswa ====");
            System.out.println("1. Lihat daftar mahasiswa");
            System.out.println("2. Tambah nilai mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("\nMasukkan pilihan Anda: ");

            // Membaca pilihan pengguna
            int choice = input.nextInt();

            // Menggunakan switch-case untuk mengeksekusi perintah sesuai dengan pilihan pengguna
            switch (choice) {
                case 1:
                    // Menampilkan daftar mahasiswa yang ada pada objek dosen
                    dosen.lihatDaftarMahasiswa();
                    break;
                case 2:
                    // Meminta pengguna untuk memasukkan NIM, nilai, dan bobot nilai
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = input.next();
                    System.out.print("Masukkan nilai: ");
                    float nilai = input.nextFloat();
                    System.out.print("Masukkan bobot: ");
                    int bobot = input.nextInt();

                    // Menambahkan nilai mahasiswa dengan NIM yang dimasukkan pengguna
                    dosen.tambahNilaiMahasiswa(nim, nilai, bobot);
                    break;
                case 3:
                    // Mengubah nilai variabel exit menjadi true agar perulangan while berhenti
                    exit = true;
                    break;
                default:
                    // Menampilkan pesan kesalahan jika pengguna memasukkan pilihan yang tidak valid
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
