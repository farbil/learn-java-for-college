import java.util.Scanner;

public class FilkomPetMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Filkom Pet House ====");

        // Input Pemilik
        System.out.print("Masukkan ID KTP Pemilik: ");
        String idPemilik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String namaPemilik = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamatPemilik = input.nextLine();
        System.out.print("Masukkan No HP: ");
        String phonePemilik = input.nextLine();

        Pemilik pemilik = new Pemilik(idPemilik, namaPemilik, alamatPemilik, phonePemilik);

        // Input Hewan
        System.out.print("\nMasukkan ID Hewan: ");
        String idHewan = input.nextLine();
        System.out.print("Masukkan Nama Hewan: ");
        String namaHewan = input.nextLine();
        System.out.print("Masukkan Umur Hewan: ");
        int umurHewan = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan spesies: ");
        String spesies = input.nextLine();

        Hewan hewan = new Hewan(idHewan, namaHewan, umurHewan, spesies, pemilik);

        // Pilih Layanan
        System.out.println("\n=== Pilih Layanan ===");
        System.out.println("1. Penitipan Harian (Rp 50.000)");
        System.out.println("2. Grooming (Rp 30.000)");
        System.out.println("3. Penitipan Premium (Rp 100.000)");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();

        Layanan layanan;

        if(pilih == 1){
            layanan = new Layanan("Layanan1", "Penitipan Harian", 50000);
        } else if(pilih == 2){
            layanan = new Layanan("Layanan2", "Grooming", 30000);
        } else{
            layanan = new Layanan("Layanan3", "Penitipan Premium", 100000);
        }

        // Input Durasi Pemesanan
        System.out.print("\nBerapa hari penitipan? ");
        int hari = input.nextInt();
        input.nextLine();

        Pemesanan pemesanan = new Pemesanan("Pemesanan1", hewan, layanan, hari);

        System.out.println("\n=== Detail Pemesanan ===");
        System.out.println(pemesanan.ambilRincianPemesanan());

        // Proses Pembayaran
        System.out.print("\nPilih metode pembayaran (Tunai/Transfer): ");
        String metode = input.nextLine();

        Pembayaran pembayaran = new Pembayaran("Pembayaran1", pemesanan, metode);

        System.out.println(pembayaran.ambilInformasiPembayaran());

        // Input Laporan Harian
        System.out.println("\n=== Input Laporan Harian ===");
        System.out.print("Tanggal (DD-MM-YYYY): ");
        String tanggal = input.nextLine();
        System.out.print("Aktivitas: ");
        String aktivitas = input.nextLine();
        System.out.print("Makanan: ");
        String makanan = input.nextLine();

        LaporanHarian laporan = new LaporanHarian("Laporan1", hewan, tanggal, aktivitas, makanan);

        System.out.println("\n=== Laporan Harian ===");
        System.out.println(laporan.ambilInformasiLaporan());

        input.close();
    }
}
