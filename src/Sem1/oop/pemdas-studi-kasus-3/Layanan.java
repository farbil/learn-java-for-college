public class Layanan {
    private String layananId;
    private String namaLayanan;
    private double hargaPerHari;

    public Layanan(String layananId, String namaLayanan, double hargaPerHari){ // ini Konstructor
        this.layananId = layananId;
        this.namaLayanan = namaLayanan;
        this.hargaPerHari = hargaPerHari;
    }

    public double ambilHargaPerHari(){ // ini getter
        return hargaPerHari;
    }

    public String ambilInformasiLayanan(){
        return "[" + layananId + "] " + namaLayanan + " (Rp" + (int) hargaPerHari + "/hari)";
    }
}
