/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package format.desimal;

/**
 *
 * @author dhanggas
 */
public class FormatNya {

    public static void main(String[] args) {
        double x = 0.9654;
        double y = 0.52654;
        System.out.println(x);
        System.out.println(y);
        System.out.println(String.format("%.3f", x));
        System.out.println("Pembulatan angka ke atas x : " + Math.ceil(x));
        System.out.println("Pembulatan angka ke atas y : " + Math.ceil(y));
        System.out.println("Pembulatan angka ke bawah x : " + Math.floor(x));
        System.out.println("Pembulatan angka ke bawah y : " + Math.floor(y));
        System.out.println("Pembulatan angka ke terdekat x : " + Math.round(x));
        System.out.println("Pembulatan angka ke terdekat y : " + Math.round(y));
    }
}
