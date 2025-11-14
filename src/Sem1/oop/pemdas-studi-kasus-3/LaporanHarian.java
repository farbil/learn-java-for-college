public class LaporanHarian {
    private String idLaporan;
    private Hewan hewan;
    private String tanggal;
    private String aktivitas;
    private String konsumsiMakananan;
    private Pemesanan pemesanan;

    public LaporanHarian(String idLaporan, Hewan hewan, String tanggal, String aktivitas, String konsumsiMakananan, Pemesanan pemesanan){
        this.idLaporan = idLaporan;
        this.hewan = hewan;
        this.tanggal = tanggal;
        this.aktivitas = aktivitas;
        this.konsumsiMakananan = konsumsiMakananan;
        this.pemesanan = pemesanan;
    }

    public String ambilInformasiLaporan(){
        return "ID Laporan: " + idLaporan +
                "\nTanggal: " + tanggal +
                "\n-- Data Pemilik --" +
                "\nID KTP Pemilik: " + hewan.ambilPemilik().ambilidPemilik() +
                "\nNama Pemilik: " + hewan.ambilPemilik().ambilNama() +
                "\nAlamat Pemilik: " + hewan.ambilPemilik().ambilAlamat() +
                "\nNo HP: " + hewan.ambilPemilik().ambilPhone() +
                "\n-- Data Hewan --" +
                "\nNama Hewan: " + hewan.ambilNama() + // cara memanggil getter
                "\nAktivitas: " + aktivitas +
                "\nMakanan: " + konsumsiMakananan +
                "\n-- Detail Pemesanan --" +
                "\n" + pemesanan.ambilRincianPemesanan().split("\n")[2] +
                "\n" + pemesanan.ambilRincianPemesanan().split("\n")[3] +
                "\nTotal Biaya: " + (int) pemesanan.ambilTotalHarga();
    }
}