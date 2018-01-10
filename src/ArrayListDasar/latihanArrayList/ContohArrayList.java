package ArrayListDasar.latihanArrayList;

import java.util.*;

public class ContohArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(15);
        data.add(100);
        data.addAll(Arrays.asList(200, 30, 10, 500));
        data.add(1, 111);
        data.set(0, 12345);
        
        if (!data.isEmpty()) {
            for (int o : data) {
                System.out.println(o);
//               
            }
        } else {
            System.out.println("Data Kosong");
        }
        System.out.println(data.size());
        System.out.println(data.get(0));
        System.out.println(data.contains(100));

//        data.remove(0);
//        data.clear();
//        Collections.sort(data);
//        data.removeAll(data);
//        Iterator t =data.iterator();
//        while (t.hasNext()) {
//            Object next = t.next();
//            System.out.println(next);
//        }
    }
}
