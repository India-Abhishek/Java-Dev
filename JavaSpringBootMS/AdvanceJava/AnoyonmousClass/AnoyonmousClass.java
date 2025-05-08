package JavaSpringBootMS.AdvanceJava.AnoyonmousClass;

//use of anoyonmous class = to implement diffrently a existing method of a class. 

abstract class A{
    public abstract void Config();
    public void show(){
        System.out.println("in A class");
    }
}

public class AnoyonmousClass {
    public static void main(String[] args) {
        A obj  = new A()  // A class is a abstract class

        // here we are creating a anoyonmus inner class.
        {
            // providing diffrent implimentation of method show()
            public void show(){
                System.out.println("in new show");
            }

            public void Config(){
                System.out.println("in config anoyonmous inner class");
            }
        };

        obj.show(); // it will call the show of new implimentation not from the A class.
        obj.Config();
        
    }
    
}
