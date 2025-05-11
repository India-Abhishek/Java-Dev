/*
 * SET = collection of value pair
 * not follows the squence
 * map itself is an interface = Map(K,V)
 * 
 * keys stored in SET
 * values stored in LIST
 * 
 * Hashtable and hashset are same where as hashtable is synchronized
 * if we have multiple thread working = bwttwer to use hash table
 */

package JavaSpringBootMS.Collection;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        // Create a map collection
        Map<String, Integer> students = new Hashtable();

        // put the values
        students.put("Abhi", 90);
        students.put("Anand", 98);
        students.put("Aman", 80);
        students.put("Yash", 79);
        students.put("Anand", 100); 
// put check if key is already there then it replace the value of that key

        // print the MAP
        System.out.println(students);

        // fetch value by its key
        System.out.println(students.get("Anand"));

        // fetch all values
        for(String key : students.keySet()){
            System.out.println(key+" : "+students.get(key));

        }

    }
    
}
