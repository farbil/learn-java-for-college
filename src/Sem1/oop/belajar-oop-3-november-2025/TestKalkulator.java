import java.util.Scanner;

public class TestKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kalkulator kalkul = new Kalkulator();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka kedua  : ");
        double b = input.nextDouble();

        kalkul.setAngka(a, b);

        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println("Penjumlahan : " + kalkul.tambah());
        System.out.println("Pengurangan : " + kalkul.kurang());
        System.out.println("Perkalian   : " + kalkul.kali());
        System.out.println("Pembagian   : " + kalkul.bagi());
    }
}
