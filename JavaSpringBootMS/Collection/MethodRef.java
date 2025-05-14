package JavaSpringBootMS.Collection;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman","Yash","John");
        
        // convert to upper case

        // convert and store in new list.
        List<String> uNames = names.stream()
                                    .map(n -> n.toUpperCase()) // convert into upper case
//in map we are taking a variable(name) and calling a method to covert it into upper case
                                    .toList(); // map to list
        for (String n : uNames){
            System.out.println(n);
        }

// Method reference

System.out.println("----------Method reference----------");

        List<String> uNames2 = names.stream()
                                    .map(String::toUpperCase) // directly call the method in method
                                    // to call the method we have to give the reference "::"which class it belongs
//map will give one element at a time and it will conver that into upper case. 
                                    .toList(); // map to list
        for (String n : uNames2){
            System.out.println(n);
        }
System.out.println("-----------------------------------------------");
        uNames2.forEach(i -> System.out.println(i));

        uNames2.forEach(System.out::println);
        // to call the method we have to give the reference "::"which class it belongs

    }
    
}
