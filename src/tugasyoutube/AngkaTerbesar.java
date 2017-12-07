
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
public class AngkaTerbesar {

    public static void main(String[] args) {
        double x, y, terbesar;

        System.out.println("Masukkan Angka Pertama :");

        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        System.out.println("Masukkan Angka Kedua :");

        Scanner sc2 = new Scanner(System.in);

        y = sc2.nextDouble();
        terbesar = x;

        if (terbesar < y) {
            terbesar = y;
            System.out.println("Angka terbesar :" + terbesar);
        } else if (terbesar > y) {
            terbesar = x;
            System.out.println("Angka terbesar :" + terbesar);
        } else {
            System.out.println("Angkanya Sama");
        }
    }
}
