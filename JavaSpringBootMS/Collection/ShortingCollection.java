package JavaSpringBootMS.Collection;

// Collection method has a sorting method
// collection class belongs to java.util package
// collection workes with wrapper

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int age;
    String name;

    //constructor
    public Students(int age, String name){
        this.age = age;
        this.name = name;
    }

    //To String
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

}


public class ShortingCollection {
    public static void main(String[] args) {

        Comparator<Students> com = new Comparator<Students>() 
        {
            @Override
            public int compare(Students i, Students j){
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        //create a list
        List<Students> stud = new ArrayList<Students>();
        
        //add values in the list.
        stud.add(new Students(29, "Aman"));      
        stud.add(new Students(18, "Anand"));      
        stud.add(new Students(23, "Yash"));      
        stud.add(new Students(32, "Amit"));      
        
        // sorting with the help of sort method of the collection
        Collections.sort(stud, com);      

        for(Students s : stud){
            System.out.println(s);
        }

        //System.out.println(stud);

    }
    
}
