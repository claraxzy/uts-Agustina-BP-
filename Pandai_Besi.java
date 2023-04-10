public class Pandai_Besi extends Penduduk{
    public Pandai_Besi(String nama, int pendapatan) {
        super(nama, pendapatan);
    }
    public double pajak(){
        return pendapatan*0.06;
    }
    public double bayar(int pendapatan, double pajak){
        return pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Pandai_Besi{" +
                "nama='" + nama + '\'' +
                ", bayar=" + bayar +
                '}';
    }
}
