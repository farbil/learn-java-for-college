public class Pemesanan {
    private String idPemesanan;
    private Hewan hewan;
    private Layanan layanan;
    private int hari;
    private double totalHarga;

    public Pemesanan(String idPemesanan, Hewan hewan, Layanan layanan, int hari){ // ini Konstructor
        this.idPemesanan = idPemesanan;
        this.hewan = hewan;
        this.layanan = layanan;
        this.hari = hari;
        perkiraanTotalHarga();
    }

    public void perkiraanTotalHarga(){

        totalHarga = layanan.ambilHargaPerHari() * hari;
    }

    public double ambilTotalHarga(){ // ini getter
        return totalHarga;
    }

    public String ambilRincianPemesanan(){
        return "Booking ID: " + idPemesanan +
                "\nHewan: " + hewan.ambilNama() +
                "\nLayanan: " + layanan.ambilInformasiLayanan() +
                "\nDurasi: " + hari + " hari" +
                "\nTotal Harga: Rp" + (int) totalHarga;
    }
}
