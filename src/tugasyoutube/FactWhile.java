
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
public class FactWhile {

    public static void main(String[] args) {
        System.out.println("Masukkan Bilangan : ");

        Scanner sc2 = new Scanner(System.in);
        double a = sc2.nextDouble();
        int hasil = 1;
        while (a > 0) {
            hasil = (int) (hasil * a);
            a--;
        }
        System.out.println("hasil" + hasil);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
