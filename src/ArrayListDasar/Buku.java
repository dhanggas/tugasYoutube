package ArrayListDasar;

public class Buku {

    private String id;
    private String judul;
    private String penerbit;
    private int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Buku(String id, String judul, String penerbit, int jumlah) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.jumlah = jumlah;
    }

    public Buku(String id, String judul, String penerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
    }

    public Buku(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

}
