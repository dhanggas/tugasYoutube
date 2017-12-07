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
public class Latihan {

    public static void main(String[] args) {
        int hargaTiket;
        boolean isMurit;
        String murid;
        System.out.println("Seorang Umur");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("Seorang pelajar (ya/no)?");
        Scanner sc2 = new Scanner(System.in);
        murid = sc2.nextLine();
        isMurit = "ya".equals(murid);

        if (age <= 15 || age > 60 || isMurit) {
            hargaTiket = 5;
            System.out.println("Haga :" + hargaTiket);
        } else {
            hargaTiket = 10;
            System.out.println("Haga :" + hargaTiket);
        }
        
        System.out.println(isMurit);
        System.out.println(age);
    }

}
