package JavaSpringBootMS.AdvanceJava.InnerClass;

class A{
    public void show(){
        System.out.println("in show class");
    }

    //defining inner class
    class B{
        public void config(){
            System.out.println("in config class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        //create an object 
        A obj = new A();
        obj.show();

        //create an object of inner class
        // to define a object of inner class we need to specify where it belongs to =A.B and 
        //we need object of outer class to clreate a object of inner class
        A.B obj2 = obj.new B();
        obj2.config();

        
    }
    
}
