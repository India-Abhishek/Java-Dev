public class TypeCasting {
    public static void main(String[] args) {
        //byte b = 126;
        int a = 257;
        byte b = (byte)a; // type conversion

        System.out.println(b);

        float c = 5.6f;
        int d = (int)c; // while conversion from float to int java lost the value after the point.
        System.out.println(d);

        byte a1 = 10;
        byte a2 = 30;

        int result = a1*a2; // byte * byte  = 300 now the value will go out of range og byte.
                            // so the value will be promoted into integer value by JAVA and we can store it into integer.

        System.out.println(result);
        
    }
    
}
