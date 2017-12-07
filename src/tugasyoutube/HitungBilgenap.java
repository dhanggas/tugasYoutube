
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
public class HitungBilgenap {
    public static void main(String[] args) {
        int i      = 0;
        int jumlah = 0;

        while (i <= 10) {
            if (i % 2 != 0) {
                jumlah = jumlah + i;
            }
            i++;
        } 

        System.out.println(jumlah + "\n");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
