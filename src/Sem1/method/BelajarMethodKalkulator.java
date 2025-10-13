import java.util.Scanner;

public class BelajarMethodKalkulator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int angka1=5, angka2 =10, c1, c2, c3;
        double c4;
        
        cetak();
        System.out.println("==================");
        // c=a+b
        c1=menjumlahkan(angka1, angka2);
        System.out.println("Hasil penjumlahan: "+c1);
        c1=menjumlahkan(20, 40);
        System.out.println("Hasil penjumlahan: "+c1);

        // c=a-b
        System.out.println();
        c2=mengurangkan(angka1, angka2);
        System.out.println("Hasil pengurangan: "+c2);
        c2=mengurangkan(20,10);
        System.out.println("Hasil pengurangan: "+c2);

        // c=a*b
        System.out.println();
        c3=mengalikan(angka1, angka2);
        System.out.println("Hasil perkalian: "+c3);
        c3=mengalikan(9, 2);
        System.out.println("Hasil perkalian: "+c3);

        // c=a/b
        System.out.println();
        c4=membagi(angka1, angka2);
        System.out.println("Hasil pembagian: "+c4);
        c4=membagi(8, 2);
        System.out.println("Hasil pembagian: "+c4);

        // (a+b)-(c+d)
        System.out.println();
        int z=mengurangkan(menjumlahkan(10, 20), menjumlahkan(2,4));
        System.out.println("Hasil z: "+z);

        // input method penjumlahan dua angka
        System.out.println();
        c1=inputpenjumlahan();
        System.out.println("Hasil penjumlahan (input): "+c1);

        // input method pengurangan dua angka
        System.out.println();
        c1=inputpengurangan();
        System.out.println("Hasil pengurangan (input): "+c1);

        // input method perkalian dua angka
        System.out.println();
        c1=inputperkalian();
        System.out.println("Hasil perkalian (input): "+c1);
        
        // input method pembagian dua angka
        System.out.println();
        c4=inputpembagian();
        System.out.println("Hasil pembagian (input): "+c4);
    }
    static int menjumlahkan(int a, int b){ // variabel 'menjumlahkan' adalah identifier | tanda '()' adalah parameter
        int c;
        c=a+b;
        return c;
    }
    static int mengurangkan(int a, int b){
        int c;
        c=a-b;
        return c;
    }
    static int mengalikan(int a, int b){
        int c;
        c=a*b;
        return c;
    }
    static double membagi(double a, double b){
        double c;
        c=a/b;
        return c;
    }
    static void cetak(){
        System.out.println("Ini adalah program untuk kalkulator");
    }

    // input method penjumlahan
    static int inputpenjumlahan(){
        System.out.println("Input penjumlahan");
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        int hasilpenjumlahan = a + b;
        return hasilpenjumlahan;
    }
    // input method pengurangan
    static int inputpengurangan(){
        System.out.println("Input pengurangan");
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        int hasilpengurangan = a - b;
        return hasilpengurangan;
    }
    // input method perkalian
    static int inputperkalian(){
        System.out.println("Input perkalian");
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        int hasilperkalian = a * b;
        return hasilperkalian;
    }
    // input method pembagian
    static double inputpembagian(){
        System.out.println("Input pembagian");
        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();
        double hasilpembagian = a / b;
        return hasilpembagian;
    }
}

/*
 * (13 Oktober 2025, Senin) Materi Pemrograman Dasar Method
 */