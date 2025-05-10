package JavaSpringBootMS.Thread;

// creating a class thread
class A1 extends Thread{
    public void run(){
        for (int i=0;  i<=100; i++){
            System.out.println("hi");
            try {
// to sleep a thread we use Thread.sleep mehod and give the time in milli secound to sleep
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

class B1 extends Thread{
    public void run(){
        for (int i=0;  i<=100; i++){
            System.out.println("Hello");
            try {
// to sleep a thread we use Thread.sleep mehod and give the time in milli secound to sleep
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPrioritySleep {
    public static void main(String[] args) {
        // creating an object of class A and B
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        // setting the priority of the thread
        //obj1.setPriority(5); // min= 1, mid =5, max =10
        //obj2.setPriority(Thread.MAX_PRIORITY);

        //calling the thread by Start method which execute the run method of the class.
        obj1.start();
        obj2.start();
        
    }
    
}
