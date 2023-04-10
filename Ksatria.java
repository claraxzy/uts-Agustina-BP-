public class Ksatria extends Penduduk{
    public Ksatria(String nama, int pendapatan) {
        super(nama, pendapatan);
    }

    public double pajak(int pendapatan) {
        return pendapatan*0.18;
    }
    public void bayar(int pendapatan, double pajak){
        return bayar=pendapatan-pajak;
    }

    @Override
    public String toString() {
        return "Ksatria{" +
                "nama='" + nama + '\'' +
                "bayar='" +bayar()+
                '}';
    }
}
