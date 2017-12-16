package tugasyoutube;

import java.util.Scanner;

public class TotalArray2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qty[][] = new int[3][3];
        int total[] = new int[6];
        int kolom[] = new int[6];

        for (int row = 0; row < qty.length; row++) {
            for (int kol = 0; kol < qty.length; kol++) {
                System.out.format("masukkan nilai (%d,%d):", row, kol);
                qty[row][kol] = input.nextInt();
            }

        }
        System.out.println("No      Jan     Feb     Mart    Total");//hanya untuk mempercantik
        System.out.println("------------------------------------------");//hanya untuk mempercantik
        for (int row = 0; row < qty.length; row++) {
            System.out.print(row+1+"\t");//hanya untuk menampilkan nomer urut
            for (int kol = 0; kol < qty.length; kol++) {
                System.out.print(qty[row][kol] + "\t");
                total[row] = total[row] + qty[row][kol];
            }

            System.out.print(total[row]);
            System.out.println("");
            System.out.println("------------------------------------------");
        }
        System.out.print("Total  ");/*hanya untuk menampilkan kata total*/
        for (int j = 0; j < qty.length; j++) {
            for (int i = 0; i < qty.length; i++) {
                kolom[j] = kolom[j] + qty[i][j];
            }
           
            System.out.print(kolom[j] + "\t");

        }
        System.out.println("\n");//untuk menmabahkan enter

    }

}
