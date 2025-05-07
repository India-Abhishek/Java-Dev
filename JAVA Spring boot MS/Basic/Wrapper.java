// Wrapper = A Wrapper class in Java is one whose object wraps or contains primitive data types.

// Boxing = taking a premitive value and storing it in a non premitive object is called boxing.
// Unboxing = storing non primitive value in primitive object.

public class Wrapper {
    public static void main(String[] args) {
        int a = 7;
        Integer num = new Integer(a); // boxing

        int b = num.intValue(); //unboxing
        System.out.println(b);


        int c = 9;
        Integer num2 = c; // auto boxing
        
        int d = num2; // auto unboxing

        System.out.println(d);

        String str = "10";
        int num3 = Integer.parseInt(str); // this method take a string and convert that into integer.

        System.out.println(num3*2);

    }
    
}
