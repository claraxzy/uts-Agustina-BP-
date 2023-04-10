public class Pedagang extends Penduduk{
    public Pedagang(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(int pendapatan){
        return pendapatan*0.12;
    }
    public double bayar(int pendapatan, double pajak){
        return pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Pedagang{" +
                "nama='" + nama + '\'' +
                ", bayar=" + bayar() +
                '}';
    }
}
