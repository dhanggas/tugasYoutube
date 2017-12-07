package tugasyoutube;

public class Array2D {

    public static void main(String[] args) {

        // membuat isi elemen array
        String[][] country = {
            // keterangan {kolom1,kolom2,kolom3}
            {"No", "Name", "Country"}, // baris ke-0
            {"1.", "David", "Australia"}, // baris ke-1
            {"2.", "Ahmad", "Indonesia"}, // baris ke-2
            {"3.", "Sudaish", "Mesir"}, // baris ke-3
//            {"4.", "Kim", "Korea"} //baris ke-4
        };

        // mendeklarasikan baris dan kolom
        int i, j;   // i = baris, j = kolom

        for (i = 0; i < 4; i++) {        // menampilkan elemen sejumlah baris
            for (j = 0; j < 3; j++) {    // menampilkan elemen sejumlah kolom

                // menampilkan isi elemen baris dan kolom
                System.out.print(country[i][j] + " ");
            }
            System.out.println("");         //pindah baris
        }
    }
}
