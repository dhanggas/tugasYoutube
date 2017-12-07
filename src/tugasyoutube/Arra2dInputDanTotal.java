package tugasyoutube;

public class Arra2dInputDanTotal {

    public static void main(String[] args) {
        String[] nama = {"Adi", "Ada", "Jon"};
        double[][] nil = {{60, 70, 90}, 
                          {80, 70, 90}, 
                          {70, 60, 90}};
        double nilai = 0;
        System.out.println("+-------+--------+------+-------+-----------+");
        System.out.println("|Nama\t|Uts\t |Uas\t|Tugas\t |Nilai Total\t");
        System.out.println("+-------+--------+------+-------+-----------+");
        for (int row = 0; row < 3; row++) {
            System.out.print("| "+nama[row]+"\t|");
            for (int kol = 0; kol < 3; kol++) {
                System.out.print(nil[row][kol] + "\t|");

            }
            nilai = (0.35 * nil[row][0]) + (0.45 * nil[row][1]) + (0.2 * nil[row][2]);
            System.out.println(nilai +"\t\t|");
        }
        System.out.println("+-------+--------+------+-------+-----------+");
        System.out.print("Total : |");
        for (int kol = 0; kol < 3; kol++) {
            
            nilai = (0.35 * nil[0][kol]) + (0.45 * nil[1][kol]) + (0.2 * nil[2][kol]);
            System.out.print(nilai +"\t|");
        }
        System.out.println("\n\n");
    }

}
