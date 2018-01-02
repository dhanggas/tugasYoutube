/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDasar.manusia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dhanggas
 */
public class MainApp {

    public static void main(String[] args) {
        ArrayList<Orang> list = new ArrayList<Orang>();
        list.add(new Orang("1234", "Joni", 20));
        list.add(new Orang("2015", "Roni", 17));
        list.add(new Orang("3214", "Joni", 15));
        for (Orang orang : list) {
            System.out.println(orang.getKtp()+" "+orang.getNama()+" "+orang.getUmur());
        }
      
        

    }
    
}
