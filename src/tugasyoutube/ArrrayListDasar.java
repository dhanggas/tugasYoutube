package tugasyoutube;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrrayListDasar {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("Baru");
        data.add("Lili");
        data.add("jono");
        
        Iterator it = data.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
