package JavaSpringBootMS.Thread.ThreadExercise;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

public class CreateThread_ex1 {
    public static void main(String[] args) {
//3 ways to create a thread
// 1.

        //to create a thread create a object of a thread class
        MyThread objThread = new MyThread();
        //start the thread
        objThread.start(); // this thread will started 
// then it will stop
        //to run the thread we will use run method

        //objThread.run();
//2.

        Thread objThread2 = new Thread(()->{ //lambda expression to give implimatation the of the run method
            System.out.println("thread 2 is running");
        });

        objThread2.start();
//3. creating the thread with runnable interface.

        Runnable runnable = new Runnable() {
            @Override
            public void run(){
                System.out.println("Thread 3 is running");
            }
        };

        Thread objThread3 = new Thread(runnable, "Runnable thread");
        objThread3.start();

    }
    
}
