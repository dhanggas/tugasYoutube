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
public class BilPrima {
    public static void main(String[] args) {
        int d,e,harmono;
        harmono=0;
        System.out.println("Masukkan bilangan");
        Scanner sc = new Scanner(System.in);
        e = sc.nextInt();
        d=1;
        while(d<=e){
            if(e%d==0){
                harmono=harmono+1;
            }
            d++;
        }
        if (harmono == 2 ){
            System.out.println("Bilangan prima");
        }else{
            System.out.println("Bukan bilangna prima");
        }
    }
    
}
