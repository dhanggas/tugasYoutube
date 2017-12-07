package tugas.array;

import java.util.Scanner;

public class Mahasiswa {

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah data yang akan di input: ");//biar ngerti aja apa yg di input
        Mahasiswa mhs = new Mahasiswa();
        mhs.input();//panggil method input
        mhs.tampil();//panggil method tampil
        mhs.cari();
    }

    Scanner scan = new Scanner(System.in); // ini untuk inisialisasi scanner untuk inputnya
    int data_mhs = scan.nextInt();// ini untuk menginputkan data mahasiswa tepatnya berapa banyak mahasiswa akan di inputkan
    String nim[] = new String[data_mhs];//array untuk nim
    String nama[] = new String[data_mhs];//array untuk nama
    String absen[] = new String[data_mhs];// array untuk absen
    String tugas[] = new String[data_mhs];
    String uts[] = new String[data_mhs];
    String uas[] = new String[data_mhs];

    public void input() {
        for (int i = 1; i <= data_mhs; i++) {
            System.out.println("Mahasiswa ke-" + i);//mahasiswa ke- (sesuai jumlah i = 0, yang di tambahkan 1 tiap perulangannya.
            System.out.print("\tNIM : ");
            nim[i - 1] = scan.next();//input Nim ke Array
            System.out.print("\tNama : ");
            nama[i - 1] = scan.next();
            System.out.print("\tNilai Absen : ");
            absen[i - 1] = scan.next();
            System.out.print("\tNilai Tugas : ");
            tugas[i - 1] = scan.next();
            System.out.print("\tNilai Uts : ");
            uts[i - 1] = scan.next();
            System.out.print("\tNilai Uas : ");
            uas[i - 1] = scan.next();
            System.out.println();//buat ngasih spasi
        }
    }

    public void tampil() {
        System.out.println("\nSemua Data Mahasiswa");//nampilin tulisan seperti disamping
        System.out.println("=============================================");
        for (int i = 1; i <= data_mhs; i++) {
            //ngulang biar ntar datanya bisa sesuai sama array yang udah disimpan System
            System.out.println(i + ". \tNIM : " + nim[i - 1]
                    + "\n\tNama: " + nama[i - 1]
                    + "\n\tNilai Absen: " + absen[i - 1]
                    + "\n\tNilai Tugas: " + tugas[i - 1]
                    + "\n\tNilai Uts: " + uts[i - 1]
                    + "\n\tNilai Uas: " + uas[i - 1] + "\n");//nampilin data sesuai yang sudah disimpan di array
        }
        System.out.println("=============================================\n");
    }

    public void cari() {//nama method
        int cari_nim = 0;//inisialisasi variable cari_nim dengan tipe data int
        int index[] = new int[data_mhs];//inisialisasi index, dan temukan data sesuai di array data_mhs
        System.out.println("Cari Data Mahasiswa");
        System.out.print("Masukkan NIM : ");
        String cari = scan.next();//masukkan nim yang akan dicari
        for (int i = 0; i < data_mhs; i++) {
            if (nim[i].equals(cari)) {//jika nimnya sama/ada
                index[cari_nim] = i;//index dengan array 0 sesuai di atas
                cari_nim++;//0 nya di tambahin 1 terus sampai ketemu data yg sesuai dengan yang di input
            }
        }
        if (cari_nim > 0) {//jika lebih dari 0 
            System.out.println("\nData Mahasiswa hasil Pencarian:");
            for (int a = 1; a <= cari_nim; a++) {
                int s = index[a - 1];  //inisialisasi s variable baru untuk nampung array

                System.out.println("=============================================");

                System.out.println("No " + (index[a - 1] + 1) + ". \tNim : " + nim[s]
                        + "\n\tNama: " + nama[s]
                        + "\n\tNilai Absen: " + absen[s]
                        + "\n\tNilai Tugas: " + tugas[s]
                        + "\n\tNilai Uts: " + uts[s]
                        + "\n\tNilai Uas: " + uas[s] + "\n");
            }
            System.out.println("=============================================\n");
        } else {
            System.out.println("data_mhsIM " + cari + " yang anda cari tidak ada");// kalo gak ketemu
        }

    }
}
