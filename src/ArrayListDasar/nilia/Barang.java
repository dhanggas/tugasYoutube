package ArrayListDasar.nilia;

class Barang {

    int id;
    String kd, nm;

    public Barang(int id, String kd, String nm) {
        this.id = id;
        this.kd = kd;
        this.nm = nm;
    }

    public Barang() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getId() {
        return id;
    }

    public String getKd() {
        return kd;
    }

    public String getNm() {
        return nm;
    }
}
