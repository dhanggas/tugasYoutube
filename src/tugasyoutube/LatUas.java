package tugasyoutube;

import java.util.Scanner;

public class LatUas {

    public static void main(String[] args) {
        System.out.println("Coba");
        int jml[][] = new int[4][4];
        int total[] = new int[4];
        int total2[] = new int[4];
        String nama[] = new String[4];

        //input data
        for (int i = 0; i < jml.length; i++) {
            //untuk membatasi baris sampai 3 baria
            
            //input nama barang
            System.out.print("Masukkan Nama barang ke-" + (i + 1) + ":");
            Scanner sc = new Scanner(System.in);
            nama[i] = sc.nextLine();
            //input nilai (i,j)
            for (int j = 0; j < jml.length; j++) {
                if (j==3) {
                    break;
                }
                System.out.format("\t \t Input Quantity (%d,%d)", i, j);
                Scanner input = new Scanner(System.in);
                jml[i][j] = input.nextInt();
            }
        }
        System.out.println("NO \tNama \t2011 \t2012 \t2013 \t2014 \tTotal");
        //menampilkan data ke samping
        for (int i = 0; i < jml.length; i++) {
           
            //menampilakan nomer 1. dan seterusnya
            System.out.print(i + 1 + ". \t");
            //menampilakn nama barang nya
            System.out.print(nama[i] + "\t");
            for (int j = 0; j < jml.length; j++) {
                if (j==3) {
                    break;
                }
                System.out.print(jml[i][j] + "\t");
                total[i] = total[i] + jml[i][j]; //membuat total di samping

            }
            System.out.print(total[i]); //menampilkan total di samping
            System.out.println(""); // untuk pindah baris berikunya dari data
        }

        //menampilkan total data di bawah
        System.out.print("Total \t\t");
        for (int i = 0; i < jml.length; i++) {
            if (i==3) {
                    break;
                }
            for (int j = 0; j < jml.length; j++) {
                total2[i] = total2[i] + jml[j][i];
            }
            
            System.out.print(total2[i] + "\t");
        }
    }
}
