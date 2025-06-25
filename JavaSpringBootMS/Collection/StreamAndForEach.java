package JavaSpringBootMS.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAndForEach {
    public static void main(String[] args) {

        // create a array list which stores the integers 
        // Arrays has a method asList which stores the elemets in arraylist.
        List<Integer> nums = Arrays.asList(5,6,1,56,1);

        //Sorting the elemets of the array list with sort method of collections.
        Collections.sort(nums);
        
        // foreach works with collection it returs n for each value of the object we passed
        nums.forEach(n -> System.out.println(n));

System.out.println("---------Stream----------");
        // create a stream and store the all elements of array list
        //Stream is an interface which takes a type
        // stream() method returns all the values. and storing in a stream object.
        Stream <Integer> s1 = nums.stream();

        Stream <Integer> s2 = s1.filter(n -> n%2==0);
        

        // it will not effect on the existing array list if we do any operation on stream.

        // if we used stream once we can not use it again.
        s2.forEach(n -> System.out.println(n));
        //s1.forEach(n -> System.out.println(n));

    }
    
}
