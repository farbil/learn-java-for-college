public class Hewan {
    private String nama;
    private int umur;
    private String spesies;
    private Pemilik pemilik;


    public Hewan(String nama, int umur, String spesies, Pemilik pemilik){ // ini Konstructor
        this.nama = nama;
        this.umur = umur;
        this.spesies = spesies;
        this.pemilik = pemilik;
    }

    public String ambilNama(){ // ini getter
        return nama;
    }

    public Pemilik ambilPemilik(){
        return pemilik;
    }

    // Getter adalah method untuk mengambil nilai atribut private
    // Setter adalah method untuk mengubah nilai atribut private
}
