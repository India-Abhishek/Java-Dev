package JavaSpringBootMS.AdvanceJava.Annotations;

/*
 * Anotations = it is a supplyment to the complier or to the run time
 * Also called as metadata.
 */

@FunctionalInterface
interface I{
    void imethod();
}

 //Creating classes
class A implements I{
    public void show(){
        System.out.println("in A class");
    }

    public void imethod(){
        System.out.println("this is in Imethod");
    }
}

// class B inherite the class A
class B extends A{

    //using anonation override to provide a new implementation to JVM
    // while orverriding a method form parent class.
    @Override
    public void show(){
        System.out.println(" in B Class");
    }
}


public class Annotations {
    public static void main(String[] args) {

        // creating an object
        B obj = new B();

        // show method called on object obj which invokes B's version of show due to method overriding.
        obj.show();
        obj.imethod();

        B obj2 = new B()
        {
            public void imethod(){
                System.out.println("In inner class");
            }
        };

        obj2.imethod();
    }
}
