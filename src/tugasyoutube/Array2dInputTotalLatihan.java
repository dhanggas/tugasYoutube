package tugasyoutube;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2dInputTotalLatihan {
    public static void main(String[] args) {
        int nil[][]=new int[3][3];
        int total[]=new int[4];
        Scanner input = new Scanner(System.in);
//        ArrayList baru = new ArrayList();
        for (int i = 0; i < nil.length; i++) {
            for (int j = 0; j < nil.length; j++) {
                System.out.format("Masukkan nilai (%d,%d)", i , j);
                nil[i][j]=input.nextInt();
            }
        }
        
////        for (int[] is : nil) {
////            for (int data : is) {
////                System.out.print(data);
////            }
//            //hanya untuk menambah kan Enter
//            System.out.println("");
//        }
        System.out.println("no \t UTS \t TUGAS \t UAS \t TOTAL");
        for (int i = 0; i < nil.length; i++) {
            System.out.print((i+1)+"\t");
            for (int j = 0; j < nil.length; j++) {
                System.out.print(nil[i][j]+"\t");
                total[i]=total[i]+nil[i][j];
            }
            
            System.out.print(total[i]);
            System.out.println("");
        }
    }
}
