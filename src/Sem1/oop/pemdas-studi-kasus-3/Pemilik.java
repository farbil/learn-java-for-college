public class Pemilik {
    private String idPemilik;
    private String nama;
    private String alamat;
    private String phone;

    public Pemilik(String idPemilik, String nama, String alamat, String phone){ // ini Konstructor
        this.idPemilik = idPemilik;
        this.nama = nama;
        this.alamat = alamat;
        this.phone = phone;
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
