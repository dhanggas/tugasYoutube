
package tugasyoutube;

import java.util.Scanner;

public class LatUas2 {
    public static void main(String[] args) {
        int jumlah[][]= new int[3][3];
        int totalSamping[]=new int[3];
        int totalBawah[]=new int[3];
        String nama[]=new String[3];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < jumlah.length; i++) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Masukkan Nama :");
            nama[i]=sc2.nextLine();
            for (int j = 0; j < jumlah.length; j++) {
                System.out.format("jumlha (%d, %d)",i , j);
                jumlah[i][j]=sc.nextInt();
            }
        }
        
        for (int i = 0; i < jumlah.length; i++) {
            System.out.print(i+1+"\t");
            System.out.print(nama[i]+"\t");
            for (int j = 0; j < jumlah.length; j++) {
                System.out.print(jumlah[i][j]+"\t");
                totalSamping[i]=totalSamping[i]+jumlah[i][j];
            }
            System.out.print(totalSamping[i]);
            System.out.println("");
        }
        System.out.print("Total\t\t");
        for (int i = 0; i < jumlah.length; i++) {
            for (int j = 0; j < jumlah.length; j++) {
                totalBawah[i]=totalBawah[i]+jumlah[j][i];
            }
            
            System.out.print(totalBawah[i]+"\t");
        }
    }
}
