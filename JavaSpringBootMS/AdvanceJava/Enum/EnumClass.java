package JavaSpringBootMS.AdvanceJava.Enum;

enum Laptop{
    //objects 
    Apple(2000), Lenovo(1500), Dell(1400), HP(1800);

    //pvt variable
    private int value;

    //Consturctor
    private Laptop(int value){
        this.value = value;
    }
    
    // Setter and getter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}

public class EnumClass {
    public static void main(String[] args) {

        // Laptop lap = Laptop.Apple;
        // System.out.println(lap.getValue());

    

        for(Laptop lap2 : Laptop.values())
        {
            System.out.println(lap2+" : "+lap2.getValue());

        }

        

        
    }
}
