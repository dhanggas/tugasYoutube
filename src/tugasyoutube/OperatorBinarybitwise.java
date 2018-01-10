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
public class OperatorBinarybitwise {

    public static void main(String[] args) {
        int x, y;
        x = 5;  //binari 0101
        y = 3;  //binari 0011
        
        System.out.println(x|y);   //binary 0111   desimalnya 7
        System.out.println(x&y);    //binary 0001   desimalnya 1
        System.out.println(x^y);    //binary 0110   desimalnya 6
        System.out.println(x>>1);   //binary 0010  desimalnya 2
        System.out.println(y<<1);   //binary 0110    desimalnya 6
    }

}
