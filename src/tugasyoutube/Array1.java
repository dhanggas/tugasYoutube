package tugasyoutube;

import java.util.Scanner;

public class Array1 {

    

    public static void main(String[] args) {
        int i=1;
        Scanner input = new Scanner(System.in);
        int  angka[] = new int[5];
        System.out.println("Masukan nilai element Array !");
        for (int counter = 0; counter < angka.length; counter++) {
            System.out.println("element ke "+ (counter + 1) + "= ");
            angka[counter] = input.nextInt();

        }
        for (int item : angka) {
            
            
            System.out.println("counter ke "+(i++)+" = "+ item + "\n");
        }
    }

}
