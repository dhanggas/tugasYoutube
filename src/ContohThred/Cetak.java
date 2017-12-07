/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContohThred;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dhanggas
 */
public class Cetak extends Thread{
    public void run(){
        for (int x=1;x<=10;x++){
            System.out.println("Angka "+x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cetak.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
