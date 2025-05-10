package JavaSpringBootMS.Thread;

// Every thread should have run method

//Created a class which is thread
class A extends Thread
{
    //private int a = 0;
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("Hi");
            //a++;
        }
    }
}

class B extends Thread
{
    //private int b = 20;
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println("Hello");
            //b++;
        }
    }
}

public class ThreadInJava {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // to call a thread we use the method start()
        // start will call the run method 
        obj1.start();
        obj2.start();


        // O.S. Scheduler is responsible to shcedule to run the thread 
        // Scheduler share the resourse (CPU) to run the threads

        //OUTPUT explain 
        
        // here both the threads runs parallelly 
            //due to which in some time thread 1 is ruuning in between  thread 2 is running
    }
}
