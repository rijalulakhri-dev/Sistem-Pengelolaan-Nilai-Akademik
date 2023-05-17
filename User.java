public abstract class User {
    private String nama; // Mendeklarasikan variabel instance privat 'nama' bertipe String

    public User(String nama) { // Konstruktor untuk menginisialisasi variabel 'nama'
        this.nama = nama;
    }

    public String getNama() { // Metode Getter untuk mengambil nilai 'nama'
        return nama;
    }

    public abstract void menu(); 
    // Metode 'menu' abstrak tanpa implementasi
        // Metode 'menu' dinyatakan abstrak, yang artinya harus diimplementasikan oleh subkelas 'Pengguna'
}
