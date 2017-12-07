
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
public class PopPerulangan {

    public static void main(String[] args) {
        int bilangan = 1;

        for (int i = 1; i < 7; i++) {
            if ((i % 3) == 0) {
                int suku1 = bilangan - 2;
                int suku2 = bilangan - 1;
                int bilanganJumlah = suku1 + suku2;

                bilangan = suku2 + 1;
                System.out.print(bilanganJumlah + "");
            } else {
                System.out.print(bilangan + "");
                bilangan = bilangan + 1;
            }
        }
    }
}
