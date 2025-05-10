package JavaSpringBootMS.Thread;

/*
 * Thread implements Runnable interface so we can directly implements Runnable
 * further
 * 
 * thread class one have only one method and is its implements an interface.
 * We can directly use lembda expression while creating the object and create the Anoyonmous class.
 * 
 */



// class One implements Runnable{
//     public void run(){
//         for(int i=0; i<=10; i++){
//         System.out.println("printing from method class AAA");
//         }
//     }
// }

// class Two implements Runnable{
//     public void run(){
//         for(int i=0; i<=10; i++){
//         System.out.println("printing from method class BBB");
//         }
//     }
// }


public class RunnableAndThread {
    public static void main(String[] args) {

        //Creating an object of rannable.
        // since runable a SAM interface we can use LEMBDA expression and create the Anoyonmous class.
        Runnable obj1 = () -> // using LEMBDA expression.
        {
            for(int i=0; i<=10; i++){
                System.out.println("printing from method class AAA");
                } 
        };

        Runnable obj2 = () ->
        {
            for(int i=0; i<=10; i++){
                System.out.println("printing from method class BBB");
                }
        };

        // creating a thread object to run the thread.
        // we can not run a interface object.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2); 

        t1.start();
        t2.start();

        //System.out.println("TEST");
        
    }
    
}
