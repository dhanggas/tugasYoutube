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
public class GenapGanjil {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Silahkan masukkan angka anda :");
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Angka genap");
        }else {
            System.out.println("Angka Ganjil");
        }
        
        
        System.out.println("TERIMAKASIH");
    }
    
}
