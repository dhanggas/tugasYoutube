
package ArrayListDasar.nilia;
class Binatang{
   int umur=12;

    public int getUmur() {
        return umur;
    } 
}






class HerbiforaOverriding extends Binatang{
    int umur=20;
    public static void main(String[] args) {
        HerbiforaOverriding hb = new HerbiforaOverriding();
        System.out.println(hb.test());
    }
    
    public int getUmur() {
        return super.umur;
    }
    
    int test(){
        return super.getUmur();
    }

    
    
}







