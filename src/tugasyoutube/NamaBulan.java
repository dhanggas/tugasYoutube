/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasyoutube;

import java.util.Scanner;

/**
 *
 * @author dhanggas
 */
public class NamaBulan {

    public static void main(String[] args) {
        String bulan;
        System.out.println("Masukkan Nomor Bulan : ");
        Scanner sc2 = new Scanner(System.in);
        int angka = sc2.nextInt();

        switch (angka) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Febriari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            default:
                bulan = "Salah angka";

        }
        System.out.println("Bulan ke " + angka + " adalah " + bulan);

    }

}
