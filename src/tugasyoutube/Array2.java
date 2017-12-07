package tugasyoutube;

public class Array2 {

    public static void main(String[] args) {
        int i=0;
        String mhs[] = {"Dono", "Danu", "Dana", "Dini", "Doni"};
//        mhs[0] = "Dono"; // isi element array 0
//        mhs[1] = "Danu"; // isi element array 1
//        mhs[2] = "Dana"; // isi element array 2
//        mhs[3] = "Dini"; // isi element array 3
//        mhs[4] = "Doni"; // isi element array 4
        
        System.out.println("========= Array of mahasiswa ==========");
        
        for (String mh : mhs) {
            System.out.println("Elemen "+ (i++) + " " +mh);
        }

    }
}
