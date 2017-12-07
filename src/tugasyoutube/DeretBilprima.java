package tugasyoutube;

import java.util.Scanner;

public class DeretBilprima {

    public static void main(String[] args) {
        int i, j, min, max;
        boolean tian;
        System.out.print("Masukkan Nilai Batas Awal = ");
        Scanner input1 = new Scanner(System.in);
        min = input1.nextInt();
        System.out.print("Masukkan Nilai Batas Akhir = ");
        Scanner input = new Scanner(System.in);
        max = input.nextInt();

        while (min >= max) {
            System.out.print("Batas akhir harus lebih besar dari batas awal.\n Masukkan nilai batas akhir lagi = ");
            max = input.nextInt();
        }
        System.out.println();
        System.out.println("Deret Bilangan Prima dari " + min + " - " + max + "");

        for (i = min; i <= max; i++) {
            tian = false;
            if (i == 2) {
                tian = true;
            } else {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        tian = false;
                        break;
                    } else {
                        tian = true;
                    }
                }
            }

            if (tian) {
                System.out.print(i + ",");
            }
        }
    }
}
