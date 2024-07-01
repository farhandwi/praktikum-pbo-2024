class ObjekPenghitung {
    // Variabel static untuk menyimpan jumlah objek yang telah dibuat
    private static int jumlahObjek = 0;

    // Konstruktor yang meningkatkan nilai variabel static setiap kali objek baru dibuat
    public ObjekPenghitung() {
        jumlahObjek++;
    }

    // Metode static untuk mendapatkan jumlah total objek yang telah dibuat
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
}

public class PenghitungObjek {
    public static void main(String[] args) {
        // Membuat beberapa objek dari kelas ObjekPenghitung
        ObjekPenghitung objek1 = new ObjekPenghitung();
        ObjekPenghitung objek2 = new ObjekPenghitung();
        ObjekPenghitung objek3 = new ObjekPenghitung();

        // Menampilkan jumlah total objek yang telah dibuat
        System.out.println("Jumlah total objek ObjekPenghitung yang telah dibuat: " + ObjekPenghitung.getJumlahObjek());
    }
}
