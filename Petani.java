public class Petani extends Penduduk{
    public Petani(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return pendapatan*0.03;
    }
    public double bayar(int pendapatan, double pajak){
        return pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Petani{" +
                "nama='" + nama + '\'' +
                ", bayar=" + bayar() +
                '}';
    }
}
