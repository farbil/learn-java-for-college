public class BelajarMethodKalkulator {
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
}

/*
 * (13 Oktober 2025, Senin) Materi Pemrograman Dasar Method
 */