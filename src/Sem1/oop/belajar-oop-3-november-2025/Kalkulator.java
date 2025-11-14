public class Kalkulator {
    private double angka1;
    private double angka2;

    public void setAngka(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public double tambah() {
        return angka1 + angka2;
    }

    public double kurang() {
        return angka1 - angka2;
    }

    public double kali() {
        return angka1 * angka2;
    }

    public double bagi() {
        if (angka2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
        return angka1 / angka2;
    }
}
