package ArrayListDasar;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLatihan {

    public static void main(String[] args) {
        ArrayList<Buku> list = new ArrayList<Buku>();
        Buku buku = new Buku("120", "Buku IPA");
        buku.setJumlah(5);
        Buku buku2 = new Buku("120", "Buku IPS", "Earl");
        buku2.setJumlah(5);
        list.add(buku);
        list.add(buku2);
        Iterator it = list.iterator();
        for (Buku bk : list) {
            System.out.println(bk.getId() + "\t" + bk.getJudul() + "\t" + bk.getPenerbit() + "\t" + bk.getJumlah());
        }
    }
}
