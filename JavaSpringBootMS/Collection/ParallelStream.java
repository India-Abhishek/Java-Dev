package JavaSpringBootMS.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    public static void main(String[] args) {

        int size = 10_000;
        //array list of integer
        List<Integer> ranNums = new ArrayList<>(size);

        // random object
        Random ran = new Random();

        for(int i=0; i<=size; i++){
            // nextint gives next random - bounded from 0 to 100.
            ranNums.add(ran.nextInt(100));
        }


        //monitor time of both opration
        long startTime = System.currentTimeMillis(); // gives current time in milli second

        // stream() takes all the values and return
        int number = ranNums.stream()
                            .map(i -> i*2) //map takes all the values and return
                            .mapToInt(i -> i) // takes map values and return it as integer 
                            .sum(); // sum all the integer values and return integer.

        long endTime = System.currentTimeMillis(); // gives current time in milli second



        long startTime2 = System.currentTimeMillis(); // gives current time in milli second

        int number2 = ranNums.parallelStream()
                            .map(i -> i*2) //map takes all the values and return
                            .mapToInt(i -> i) // takes map values and return it as integer 
                            .sum(); // sum all the integer values and return integer.

        long endTime2 = System.currentTimeMillis(); // gives current time in milli second
        
        System.out.println(number+" : "+number2);
        System.out.println(endTime-startTime);
        System.out.println(endTime2-startTime2);

                        
    }
    
}
