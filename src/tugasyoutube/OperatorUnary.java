package tugasyoutube;

public class OperatorUnary {

    public static void main(String[] args) {
        int x, y;
        x = 5;

        ++x;    //increment prefix x+1=6
        x++;    //increment pstfix x+1=7
        --x;    //decrement prefix x-1=6
        x--;    //decrement postfix x-1=5

        System.out.println(x);

//        y=x++;  //y=5 karena x dimasukkan dulu ke y baru +1
        y = ++x;      //y=6 karena x nya ditambah 1 dulu
        System.out.println(y);
        
        y=-y;  //oerator negasi
        System.out.println(y);
        
        y=~y; //operator complement : yait nilai di negasikan dulu baru dikurangi 1
        System.out.println(y);
        
        

    }
}
