package ArrayListDasar.nilia;

import java.util.ArrayList;
import java.util.Scanner;

public class TampilData {

    ArrayList<Barang> tampung;

    public TampilData() {
        //instansiasi
        tampung = new ArrayList<Barang>();
    }

    public void isiData(int id, String kd, String nm) {
        tampung.add(new Barang(id, kd, nm));
    }

    public void showData() {
        for (Barang barang : tampung) {
            System.out.println("id brg : " + barang.getId() + "" + ", kd brg : " + barang.getKd() + "" + ", nm brg : " + barang.getNm());
        }
    }

    public static void main(String args[]) {

        TampilData td = new TampilData();
        System.out.println("Masukkan Jumah Data :");
        Scanner inpt = new Scanner(System.in);
        int jml = inpt.nextInt();
        for (int i = 1; i <= jml; i++) {

//        td.isiData(1, "01", "topi");
//        td.isiData(2, "02", "kemeja");
//        td.isiData(3, "03", "sepatu");
//        td.isiData(4, "04", "sandal");
            System.out.println("Masukkan data ke-"+i);
            System.out.print("Masukkan id :");
            Scanner input = new Scanner(System.in);
            int idnya = input.nextInt();
            System.out.print("Masukkan kode :");
            Scanner sc = new Scanner(System.in);
            String kd = sc.nextLine();
            System.out.print("Masukkan Nama :");
            Scanner scn = new Scanner(System.in);
            String nama = scn.nextLine();
            td.isiData(idnya, kd, nama);
        }
        td.showData();
    }
}
