/*
hiding the data from others by making the variable private and only way to access it is - with the help of methods is called encapsulation in oops
binding our data with the methods.

Encapsulation = Technique to protect an object’s data from unauthorized access and 
modification by using private fields and providing public getter and setter methods. 

>>why encapsulation

Data Hiding: The internal data of an object is hidden from the outside world, preventing direct access.
Data Integrity: Only validated or safe values can be assigned to an object’s attributes via setter methods.
Reusability: Encapsulated code is more flexible and reusable for future modifications or requirements.
Security: Sensitive data is protected as it cannot be accessed directly.

 */

class Details{
    private int CardNo = 1234; // private is accessiable throuth its own method -- not accessable outide of the class 
    private String Bank = "SBI";

    public void getCardDetails(){
        System.out.println(CardNo+" : "+Bank);
    }

    public void setCardDetails(int a, String b){
        CardNo = a;
        Bank = b;
    }

}


public class Encapsulation {
    public static void main (String [] args){

        Details d = new Details();
        //d.Bank = "AXIS";
        //System.out.println(d.bank);
 // it will be not accessable beacuse the variable is private and only accessable witthin the class

        // To access the data of private variable of other class - can be access throuth the method of that class.
        d.setCardDetails(8346, "Axis");
        d.getCardDetails();


        
        
    }
    
}
