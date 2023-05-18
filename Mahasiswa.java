// Class Mahasiswa
import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa { 
    // Instance variables
    private String nim;
    private String nama;
    private int angkatan;
    private ArrayList<Float> daftarNilai = new ArrayList<>();
    private ArrayList<Integer> daftarBobot = new ArrayList<>();

    // Constructor
    public Mahasiswa(String nim, String nama, int angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
    }

    // Method to get NIM
    public String getNim() {
        return this.nim;
    }

    // Method to get nama
    public String getNama() {
        return this.nama;
    }

    // Method to set nilai and bobot
    public void setNilai(float nilai, int bobot) {
        this.daftarNilai.add(nilai);
        this.daftarBobot.add(bobot);
    }

    // Method to calculate nilai rata-rata
    public float hitungNilai() {
        float total = 0;
        int totalBobot = 0;

        for (int bobot : this.daftarBobot) {
            totalBobot += bobot;
        }

        for (int i = 0; i < this.daftarNilai.size(); i++) {
            float nilai = this.daftarNilai.get(i);
            int bobot = this.daftarBobot.get(i);
            total += (nilai * bobot);
        }

        return (total / totalBobot);
    }

    // Method to display daftar nilai
    public void lihatDaftarNilai() {
        if (this.daftarNilai.isEmpty()) {
            System.out.println("Belum ada nilai yang dimasukkan.");
        } else {
            System.out.println("Daftar Nilai:");
            for (int i = 0; i < this.daftarNilai.size(); i++) {
                float nilai = this.daftarNilai.get(i);
                int bobot = this.daftarBobot.get(i);
                System.out.printf("- Nilai %d: %.2f (Bobot: %d)\n", i+1, nilai, bobot);
            }
        }
    }

    // Static method to create new Mahasiswa object
    public static Mahasiswa tambahMahasiswa() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan angkatan: ");
        int angkatan = input.nextInt();

        return new Mahasiswa(nim, nama, angkatan);
    }
}
