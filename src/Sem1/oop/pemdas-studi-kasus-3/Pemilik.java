public class Pemilik {
    private int idPemilik;
    private String nama;
    private String alamat;
    private String phone;

    public Pemilik(int idPemilik, String nama, String alamat, String phone){ // ini Konstructor
        this.idPemilik = idPemilik;
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
    }

    public int ambilidPemilik(){
        return idPemilik;
    }

    public String ambilNama(){ // ini getter
        return nama;
    }

    public String ambilAlamat(){
        return alamat;
    }

    public String ambilPhone(){
        return phone;
    }
}
