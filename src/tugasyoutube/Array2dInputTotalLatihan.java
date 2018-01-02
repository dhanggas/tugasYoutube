package tugasyoutube;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2dInputTotalLatihan {

    public static void main(String[] args) {
        int nil[][] = new int[4][4];
        int total[] = new int[5];
        String nama[] = {"Joi", "Roi", "Tia"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nil.length; i++) {
            if (i == 3) {
                break;
            }
            for (int j = 0; j < nil.length; j++) {
                System.out.format("Masukkan nilai (%d,%d)", i, j);
                nil[i][j] = input.nextInt();
            }
        }
        System.out.println("NO \tNAMA \tABSEN \tTUGAS \tUTS \tUAS \tTOTAL");
        for (int i = 0; i < (nil.length - 1); i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(nama[i] + "\t");
            for (int j = 0; j < nil.length; j++) {
                System.out.print(nil[i][j] + "\t");
                total[i] = total[i] + nil[i][j];
            }
            System.out.print(total[i]);
            System.out.println("");
        }
    }
}
