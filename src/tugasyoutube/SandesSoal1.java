/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasyoutube;

/**
 *
 * @author dhanggas
 */
public class SandesSoal1 {
    public static void main(String[] args) {
           int batas = 8;
        SandesSoal1 S1 = new SandesSoal1(batas);
        S1.Prosescari();
    }

    int[] deret;

    public SandesSoal1(int d) {
        deret = new int[d];
    }

    public void Prosescari() {
        int x = 1;
        int y = 2;

        for (int i = 0; i < deret.length; i++) {
            System.out.println(" Deret Bilangan  ");
            System.out.print( " "+ x  );
            x = x * y;
            y = x / y;
        }
    }

    
}