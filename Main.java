import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("001", "Rizky", 2020);
        Mahasiswa mahasiswa2 = new Mahasiswa("002", "Nabila", 2020);
        Mahasiswa mahasiswa3 = new Mahasiswa("003", "Aulia", 2021);

        Dosen dosen = new Dosen("001", "Wahyu");
        dosen.tambahMahasiswa(mahasiswa1);
        dosen.tambahMahasiswa(mahasiswa2);
        dosen.tambahMahasiswa(mahasiswa3);

        boolean exit = false;
        while (!exit
        ) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n==== Aplikasi Perekaman Nilai Mahasiswa ====");
            System.out.println("1. Lihat daftar mahasiswa");
            System.out.println("2. Tambah nilai mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("\nMasukkan pilihan Anda: ");
            int choice = input.nextInt();
    
            switch (choice) {
                case 1:
                    dosen.lihatDaftarMahasiswa();
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = input.next();
                    System.out.print("Masukkan nilai: ");
                    float nilai = input.nextFloat();
                    System.out.print("Masukkan bobot: ");
                    int bobot = input.nextInt();
                    dosen.tambahNilaiMahasiswa(nim, nilai, bobot);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}    