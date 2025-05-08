//Constructor is a sspacial method. it has the same name as class name
// Never returns anything.
//Defult and Permerterize

class Human{
    private int id;
    private String name;

    public Human(){         //DEFULT CONSTRUCTOR
        id = 1;
        name = "Aman";
    }

    public Human(int id, String name){      //Permerterized constructor
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getid(){
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Human a = new Human();
        System.out.println(a.getName()+":"+a.getid());

        Human b = new Human(2,"anand");
        System.out.println(b.getName()+":"+b.getid());
        
    }
}
