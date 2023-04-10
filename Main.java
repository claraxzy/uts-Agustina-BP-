public class Main {
    public static void main(String[] args) {
        Penduduk penduduk1 = new Penduduk("Ksatria",7000000);
        Penduduk penduduk2 = new Penduduk("Pedagang",100000);
        Penduduk penduduk3 = new Penduduk("Petani",50000);
        Penduduk penduduk4 = new Penduduk("Pandai Besi",20000);

        System.out.println(penduduk1.toString());
        System.out.println(penduduk2.toString());
        System.out.println(penduduk3.toString());
        System.out.println(penduduk4.toString());
    }
}