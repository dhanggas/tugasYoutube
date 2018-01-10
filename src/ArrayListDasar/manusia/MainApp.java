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

    ArrayList<Orang> list = new ArrayList<Orang>();

    public static void main(String[] args) {
        MainApp mp = new MainApp();
        mp.isiData("123", "oni", 18);
        mp.lihatData();
    }

    public void isiData(String ktp, String nama, int umur) {
        list.add(new Orang(ktp, nama, umur));

    }
    public void lihatData(){
        for (Orang orang : list) {
            System.out.println(orang.getKtp()+orang.getNama()+orang.getUmur());
        }
    }

}
