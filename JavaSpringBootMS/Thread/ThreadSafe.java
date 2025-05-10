package JavaSpringBootMS.Thread;
/*
 * running two thread at once which share one common variable.
 * to make sure one thread work one at a time on the variable = synchronized
 */


//class which increment value

class ForIncrement{

    int count;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        
        //object of class ForIncrement
        ForIncrement inc = new ForIncrement();

        //object with anoyonmous class using lembda expression.
        Runnable obj1 = () -> 
        {
            for(int i=1; i<=1000; i++){
                inc.increment();
            }
        };

        Runnable obj2 = () -> 
        {
            for(int i=1; i<=1000; i++){
                inc.increment();
            }
        };

        // thread object
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        //running both thread to increment the value of one common variable
        t1.start();
        t2.start();;

        //use to wait for to complete the both thread.
        t1.join();
        t2.join();

        System.out.println(inc.count);

    }
    
}
