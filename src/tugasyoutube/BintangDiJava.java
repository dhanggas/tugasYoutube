
package tugasyoutube;

public class BintangDiJava {
    public static void main(String[] args) {
        //U bintang rata kiri
//       int x=5;
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//                
//            }
//            System.out.println("");
//        }


//u/ bintang rata kanan
//    int x=5;
//        for (int i=1;i<=5;i++){
//            for(int j=4;j>=i;j--){ //spasi
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){ //bintang
//                System.out.print("*");
//            }
//            System.out.println();
//        }

   int x=5;
        for (int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){ //spasi
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ //bintang
                System.out.print("*");
            }
            for (int l = 0; l < i-1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
