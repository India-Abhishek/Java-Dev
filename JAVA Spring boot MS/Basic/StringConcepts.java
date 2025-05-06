public class StringConcepts {
    public static void main(String[] args) {
        
        
        //Strings functions

        String str = "Aman";
        System.out.println(str);
        // concatinate means adding two strings
        System.out.println(str + " Bro");
        System.out.println(str.concat(" Kumar"));

        System.out.println(str.length()-1); // give the lenght of the string.


        // String is ==== Immutable String = that can not change 

        // String buffer === mutable String = can be change
//--String buffer - thread safe
        StringBuffer sb = new StringBuffer("Anand");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Raj");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //Convert string buffer data and store in String

        String stb = sb.toString();
        System.out.println(stb);

//-- String Builder - not thread safe
        

    }
    
}
