// Object always created in Heap memory.

class Calc{                     // create a class
    static String s = "Done";
    int c;

    public int add(int a, int b){
        c = a+b;
        return c;
    }

    static{
        System.out.println("Load static class");
    }

    public static void staticMethod(){
        System.out.println("in static method "+s); //we can not use non static variable in static method!!!
    }
}

public class Object {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Calc");      // fforName is used to load a class in JVM
                                            // it will not create an object, it just initiate it.

        // Calc c = new Calc(); // create an object with help of new keyword
        // int result = c.add(3,6); //calling method of an object
        // System.out.println(result);

        // Calc.staticMethod();
    }
    
}
