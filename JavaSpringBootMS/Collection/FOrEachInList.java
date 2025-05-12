package JavaSpringBootMS.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FOrEachInList {
    public static void main(String[] args) {

        // create a array list which stores the integers 
        // Arrays has a method asList which stores the elemets in arraylist.
        List<Integer> nums = Arrays.asList(5,6,1,56,1);

        //Sorting the elemets of the array list with sort method of collections.
        Collections.sort(nums);
        
        // foreach works with collection it returs n for each value of the object we passed
        nums.forEach(n -> System.out.println(n));

    }
    
}
