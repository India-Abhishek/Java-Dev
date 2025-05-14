package JavaSpringBootMS.Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        //a Array list of string values
        List <String> names = Arrays.asList("Aman","Yash","John","Amit");
        //printing the elements from array list
        for(String n : names){
            System.out.println(n);
        }
        // optional 
        Optional<String> name = names.stream()
                                    .filter(str -> str.contains("J"))
                                    .findFirst(); //find the first value which contains J

        Optional<String> name2 = names.stream()
                                    .filter(n -> n.contains("X"))
                                    .findFirst();       
                                    
        System.out.println(name.get()); // get all the values which are in optional
        // if filtered values is not list than return the message.
        System.out.println(name2.orElse("Not exist in list"));  

        // we use orElse() to avoid null point exception.

        // to avoid optional class
        String name3 = names.stream()
                                    .filter(n -> n.contains("Q"))
                                    .findFirst()
                                    .orElse("not there"); 
        System.out.println(name3);

        
    }
    
}
