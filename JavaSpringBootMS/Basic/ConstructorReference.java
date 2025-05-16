package JavaSpringBootMS.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{
    private String name;
    private int id;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Students [name=" + name + ", id=" + id + "]";
    }
    
}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anu", "aman", "john");

        List<Students> student = new ArrayList<>();
   
        List<Students> student2 = new ArrayList<>();

        //objects for every name

        // for(String n : names){
        //     student.add(new Students(n));
        // }

         
        student = names.stream()
                        //taking a name of type stream and creating a new object with that name
                        .map(n -> new Students(n))
                        .toList();
        System.out.println(student);
// Constructor reference

        student2 = names.stream()
                        //Create a ew object  -- method reference
                        .map(Students::new) //
                        .toList();

        System.out.println(student2);

    }
    
}
