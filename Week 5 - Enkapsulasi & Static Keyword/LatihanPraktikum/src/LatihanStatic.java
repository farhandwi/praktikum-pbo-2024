class ObjekPenghitung {
    private static int jumlahObjek = 0;

    public ObjekPenghitung() {
        jumlahObjek++;
    }

    public static int getJumlahObjek() {
        return jumlahObjek;
    }
}

public class LatihanStatic {
    public static void main(String[] args) {
        // Membuat beberapa objek dari kelas ObjekPenghitung
        new ObjekPenghitung();
        new ObjekPenghitung();
        new ObjekPenghitung();

        // Menampilkan jumlah total objek yang telah dibuat
        System.out.println("Jumlah total objek ObjekPenghitung yang telah dibuat: "
                + ObjekPenghitung.getJumlahObjek());
    }
}