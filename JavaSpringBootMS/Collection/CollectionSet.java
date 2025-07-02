/*-----HASH SET-----
 * collection of unique value.
 * Set supports unique values
 * --not follows the squence/sorted format.
 * --  it dosen't have index value.
 * 
 * ----Tree SET-----
 * for shorted values we use tree set.
 * why shorted? becaues tree set extends the shortedSet class thay why all elements gets shorted
 */

package JavaSpringBootMS.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
    public static void main(String[] args) {

System.out.println("---------Hash Set--------");
        //Set implemets collection but class whcih implements set is diff.- HashSet
        Set<Integer> se = new HashSet<Integer>();

        //add values in set
        se.add(731);
        se.add(691);
        se.add(529);
        se.add(872);
        se.add(529); // if we fetch the set values it will not give 5 two time
                        //coz it supports unique

        for(int a : se){
            System.out.println(a);
        }
//---Tree Set---
//use for sorted values.

System.out.println("---------Tree Set--------");

        //created a tree set collection
        Set<Integer> se2 = new TreeSet<Integer>();
        // inserting values in treeset
        se2.add(38);
        se2.add(55);
        se2.add(29);
        se2.add(92);

        // Iterator is use to iterate the values from a collection
        // create a Itreator obj =  values which store the all values
        Iterator<Integer> values = se2.iterator();

        // printing all the values
        while (values.hasNext()) { // this method tells that do it it has next element.
            System.out.println(values.next()); // next() mrthod give you the next one element
        }

        //Fetching the values.
        for(int j : se2){
            System.out.println(j);
        }
    }

}
