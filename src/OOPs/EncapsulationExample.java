package OOPs;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        name = this.name;
        age = this.age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}


public class EncapsulationExample {
    public static void main(String[] args) {
        //Think of a capsule as a person.
        // The person's name and age are private information,
        // and they have methods to get or update this information safely.

        Person p = new Person("Aman", 20);
        System.out.println(p.getName());
        System.out.println(p.getAge());

        p.setAge(30);
        System.out.println(p.getAge());
        
    }
    
}
