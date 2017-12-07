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
public class ProgramPangkat {

    public static void main(String[] args) {
        System.out.println("Masukkan Bilangan : ");
        Scanner sc = new Scanner(System.in);
        double bil = sc.nextDouble();

        System.out.println("Masukkan Pangkat : ");
        Scanner sc2 = new Scanner(System.in);
        double pangkat = sc2.nextDouble();

        int i = 0;
        double hasil = 1;
        while (i < pangkat) {

            hasil = hasil * bil;
            i++;
        }
        System.out.println("Hasil pangkat " + hasil);
    }

}
