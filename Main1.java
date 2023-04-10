public class Main {
    public static void main(String[] args) {
        item[] listitem= new item[3];
        listitem[0]= new item(1000,"potion","S",3);
        listitem[1]= new item(5000,"Sword","A",1);
        listitem[2]= new item(10000,"Armor","A",1);
        item.seeAllitem();
    }
}