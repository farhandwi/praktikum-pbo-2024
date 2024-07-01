import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private static int jumlahMahasiswa;
    Mahasiswa mhs;

    Kelas(String namaKelas){
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<Mahasiswa>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa){
        this.daftarMahasiswa.add(mahasiswa);
        Kelas.jumlahMahasiswa++;
    }

    public void hapusMahasiswa(Mahasiswa mahasiswa){
        this.daftarMahasiswa.remove(mahasiswa);
        Kelas.jumlahMahasiswa--;
    }

    public double hitungRataRata(){
        double rata2;
        double jumlahNilai = 0;
        int jumlah = daftarMahasiswa.size();
        for(int i = 0; i < jumlah; i++){
            jumlahNilai = jumlahNilai + daftarMahasiswa.get(i).getNilai();
        }
        rata2 = jumlahNilai/jumlah;
        return rata2;
    }

    public static int getJumlahMahasiswa(){
        return Kelas.jumlahMahasiswa;
    }

    public String getNamaKelas(){
        return this.namaKelas;
    }

    public ArrayList<Mahasiswa> getArrayList(){
        return this.daftarMahasiswa;
    }
}
