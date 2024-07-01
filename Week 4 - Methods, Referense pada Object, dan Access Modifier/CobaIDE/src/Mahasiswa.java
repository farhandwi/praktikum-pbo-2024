public class Mahasiswa {
    private String nama;
    private String nim;
    private double nilai;

    Mahasiswa(String nama, String nim, double nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    Mahasiswa(String nama, String nim){
        this(nama, nim, 0);
    }

    public double getNilai(){
        return this.nilai;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNilai(double nilai){
        this.nilai = nilai;
    }
}
