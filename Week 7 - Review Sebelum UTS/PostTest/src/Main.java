import java.util.ArrayList;

public class Main {

    static ArrayList<Kelas> daftarKelas = new ArrayList<Kelas>();
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("Farhan", "105221036");
        mahasiswa1.setNilai(100);
        Mahasiswa mahasiswa2 = new Mahasiswa("Mufida", "105221032", 90);
        Mahasiswa mahasiswa3 = new Mahasiswa("Farel", "105221035", 90);
        Mahasiswa mahasiswa4 = new Mahasiswa("Ari", "105221030");
        mahasiswa4.setNilai(100);
        Mahasiswa mahasiswa5 = new Mahasiswa("Aom", "105221031", 100);
        Mahasiswa mahasiswa6 = new Mahasiswa("Baiquni", "105221033", 100);
        Mahasiswa mahasiswa7 = new Mahasiswa("Mirza", "105221039");
        mahasiswa7.setNilai(100);
        Mahasiswa mahasiswa8 = new Mahasiswa("Ichiro", "105221040", 80);
        Mahasiswa mahasiswa9 = new Mahasiswa("Ahmad", "105221041", 80);

        Kelas kelas1 = new Kelas("CS4");
        Kelas kelas2 = new Kelas("CS3");
        Kelas kelas3 = new Kelas("CS2");

        kelas1.tambahMahasiswa(mahasiswa1);
        kelas1.tambahMahasiswa(mahasiswa2);
        kelas1.tambahMahasiswa(mahasiswa3);
        kelas2.tambahMahasiswa(mahasiswa4);
        kelas2.tambahMahasiswa(mahasiswa5);
        kelas2.tambahMahasiswa(mahasiswa6);
        kelas3.tambahMahasiswa(mahasiswa7);
        kelas3.tambahMahasiswa(mahasiswa8);
        kelas3.tambahMahasiswa(mahasiswa9);

        daftarKelas.add(kelas1);
        daftarKelas.add(kelas2);
        daftarKelas.add(kelas3);

        hitungRataRataKelas();
        daftarKelas.get(0).hapusMahasiswa(mahasiswa1);
        daftarKelas.get(1).hapusMahasiswa(mahasiswa4);
        daftarKelas.get(2).hapusMahasiswa(mahasiswa7);
        hitungRataRataKelas();
        


    }

    public static void hitungRataRataKelas(){
        System.out.println("\n\n=====Method hitung rata-rata kelas=====");
        displayRataRataKelas();
        displayRataRataSemuaKelas();
    }
    
    public static void displayRataRataKelas(){
        System.out.println("Nama Kelas\t = " + daftarKelas.get(0).getNamaKelas() + ", nilai rata-rata\t = " + daftarKelas.get(0).hitungRataRata()); 
        System.out.println("Nama Kelas\t = " + daftarKelas.get(1).getNamaKelas() + ", nilai rata-rata\t = " + daftarKelas.get(1).hitungRataRata()); 
        System.out.println("Nama Kelas\t = " + daftarKelas.get(2).getNamaKelas() + ", nilai rata-rata\t = " + daftarKelas.get(2).hitungRataRata()); 
    }

    public static void displayRataRataSemuaKelas(){
        double rata2;
        double jumlahNilai = 0;
        for(int i = 0; i < daftarKelas.get(0).getArrayList().size(); i++){
            jumlahNilai = jumlahNilai + daftarKelas.get(0).getArrayList().get(i).getNilai();
        }
        for(int i = 0; i < daftarKelas.get(1).getArrayList().size(); i++){
            jumlahNilai = jumlahNilai + daftarKelas.get(1).getArrayList().get(i).getNilai();
        }
        for(int i = 0; i < daftarKelas.get(2).getArrayList().size(); i++){
            jumlahNilai = jumlahNilai + daftarKelas.get(2).getArrayList().get(i).getNilai();
        }
        
        rata2 = jumlahNilai/daftarKelas.get(0).getJumlahMahasiswa();

        System.out.println("Jumlah Mahasiswa = " + daftarKelas.get(0).getJumlahMahasiswa() + "\nRata-rata Seluruh Mahasiswa = " + rata2);
    }
}
