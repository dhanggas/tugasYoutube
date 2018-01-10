package tugasyoutube;

import java.util.Calendar;
import java.util.Locale;

public class CharKhususDijava {

    public static void main(String[] args) {
//        int x=35;
//        int y=6;
//        
//        int z = (int) (x+y+0.1235);
//        System.out.println(z);

        char a = 'A';
        char b = 'B';

        /*
        \b....untuk backspace
        \t....untuk memberikan tab / spasi
        \n....memberikan linefeed (ganti baris)
        \r ...carrige return (menghapus data sebelumnya)
        \"....untuk ngeprin " (double qouto)
        \'....untuk ngeprin " (single qouto)
        \\...untuk ngeprin backslas
        \r	Carriage return
        \f	Formfeed
        \ u .....untuk print charakter dengan memasukkan hexadesimalnya
                contoh System.out.println("\u003E");
         */
        long n = 461012;
        System.out.format("%d%n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        System.out.format("%tD%n", c);    // -->  "05/29/06"

    }
}
