/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDasar.manusia;

/**
 *
 * @author dhanggas
 */
public class Orang {
    private String ktp;
    private String nama;
    private int umur;

    public Orang() {
    }

    public Orang(String ktp, String nama, int umur) {
        this.ktp = ktp;
        this.nama = nama;
        this.umur = umur;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    
}
