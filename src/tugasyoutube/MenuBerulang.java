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
public class MenuBerulang {

    public static void main(String[] args) {
        int d, e, f;
        char a = 'y';
        while (a == 'y') {
            System.out.println("Bil pertama");
            Scanner sc = new Scanner(System.in);
            e = sc.nextInt();

            System.out.println("Bil kedua");
            Scanner sc2 = new Scanner(System.in);
            f = sc2.nextInt();
            d = e + f;
            System.out.println("nilai Jumlah :" + d);
            System.out.println("May cek lagi (y/n)");
            Scanner sc3 = new Scanner(System.in);
            a = sc3.next().charAt(0);
        }
    }

}
