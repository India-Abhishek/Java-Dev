package JavaSpringBootMS.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// when we initialize a collection we need to give typ3 in angular bracket.
// by default collection API works with object.
// mention the type of genrics to privent the Bug/run time execption
//
// ---LIST is collection API concept which supports index value.
// ---LIST supports same values (one element value twice in list).
// 

public class CollectionFirst {
    public static void main(String[] args) {

System.out.println("------Collection List------");
// wants to store values and fetch we use collection.
        // create a collection of array list
        Collection<Integer> a = new ArrayList<Integer>();

        //add value in Collection array list
        a.add(8);
        a.add(9);
        a.add(7);
        a.add(6);

        // fetch the values from collection array list one by one.
        for (int b : a){
            System.out.println(b);
        }

        System.out.println("Size of an array List: "+a.size());

System.out.println("------List------");

// to get the index value we nedd to use LIST
        List<Integer> lis = new ArrayList<Integer>();

        //add value in Collection array list
        lis.add(8);
        lis.add(9);
        lis.add(7);
        lis.add(6);

        // fetch the values by index no.
        System.out.println(lis.get(2));

        // fetch one by one
        for(int l : lis){
            System.out.println((l));
        }

    }
    
}
