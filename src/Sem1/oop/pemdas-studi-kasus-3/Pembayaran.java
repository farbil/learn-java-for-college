public class Pembayaran {
    private String idPembayaran;
    private Pemesanan pemesanan;
    private String metode;

    public Pembayaran(String idPembayaran, Pemesanan pemesanan, String metode){ // ini Konstructor
        this.idPembayaran = idPembayaran;
        this.pemesanan = pemesanan;
        this.metode = metode;
    }

    public String ambilInformasiPembayaran(){
        return "ID Pembayaran: " + idPembayaran +
                "\nTotal: Rp" + (int) pemesanan.ambilTotalHarga() +
                "\nMetode: " + metode;
    }
}