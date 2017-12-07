/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohThred;

/**
 *
 * @author dhanggas
 */
public class MainClass {
    public static void main(String[] args) {
        Cetak ck = new Cetak();
        Cetak ck2 = new Cetak();
        ck.run();
        ck2.run();
    }
    
}
