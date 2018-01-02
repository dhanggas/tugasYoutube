package ArrayListDasar.nilia;

class ClassDidalamClass extends Terbang{
    public static void main(String[] args) {
        Terbang tb = new Terbang();
        tb.tampil();
    }
    
}






class Terbang{
    
    
    
    
    class Kupu{
        void umur(){
            System.out.println("75 tahun");
        }
    }
    
    void tampil(){
        Kupu kp = new Kupu();
        kp.umur();
    }
}