package tugasyoutube;

public class StringLatihan {

    public static void main(String[] args) {
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1,1,4);
        System.out.println("Returned String: " + Str2);
//
//        String string = "Halo";
//        String string2 = "Halo";
//
//        String st = "JONO".concat(string);
//        int p = st.length();
//        System.out.println("Panjang String nya : " + p);
//
//        char ch = st.charAt(1);
//        System.out.println(ch);
//        
//        int result =string.compareTo(string2);
//        System.out.println(result);
//        
//        String st3 = "";
//        String st4= st3.copyValueOf(helloArray, 2, 2);
//        System.out.println(st4);
//        
//        boolean retVal;
//        retVal=helloSt.endsWith("lo");
//        System.out.println(retVal);
        String str1 = new String("Welcome to Tutorialspoint.com");
        String str2 = new String("Welcome to TutOrialspoint.com");

//        System.out.print("Canonical representation:");
//        System.out.println(Str1.intern());
//
//        System.out.print("Canonical representation:");
//        System.out.println(Str2.trim());
//        char a =Str2.charAt(5);
//        System.out.println(a);
        
        int result = str1.compareToIgnoreCase(str2 );
        System.out.println(result);
        
        boolean retVal,retVal2;
        retVal = str1.endsWith( "com" );
      System.out.println("Returned Value = " + retVal );
      
      retVal2 = str1.equalsIgnoreCase(str2 );
      System.out.println("Returned Value = " + retVal2 );
      
      String Str = new String("Welcome to Tutorialspoint.com");
      System.out.println("Hashcode for Str :" + Str.hashCode() );
      
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf('T',9));
      
      System.out.print("Found Last Index :" );
        System.out.println(Str.length());
      System.out.println(Str.lastIndexOf( 'm' ));
      
      System.out.print("Return Value :" );
      System.out.println(Str.replace('o', 'T'));
      

    }
}
