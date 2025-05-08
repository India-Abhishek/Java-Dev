package JavaSpringBootMS.AdvanceJava.Interface;

/*
 * Interface is like a class but by defult all the cariable and methods are public abstract
 * All the variable inside the interface are by defult final and static
 * Inheritance is also valid in interface
 */

interface A{

    int num = 10;

    void show();
    void config();
}

interface A2{
    void run();

}

interface A3 extends A2{

}

// a class can implement one or more interfaces
// what ever method we have defined in interface we have to initiate in our class.
class B implements A,A3 {
    public void show(){
        System.out.println("Show method");
    } 

    public void config(){
        System.out.println("in config method");
    }

    public void run(){
        System.out.println("running");
    }
}

public class Interface {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.num);
    }

    
}
