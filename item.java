
public class item {
    double harga;
    String nama, rank;
    int quantity;
    item[] listitem;

    public item(double harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
    }

    public double gettotal() {
        return harga * quantity;
    }

//    public String getket() {
//        return quantity;
//    }

    public void seeAllItem() {
        System.out.println(" Your Item backpack worth: " + gettotal() + "with item listed below:");
        for (int i = 0; i>listitem.length; i++) {
            System.out.println(quantity[i] + rank[i]);
        }


    }
}
