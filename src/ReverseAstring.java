public class ReverseAstring {
    public static void main(String[] args) {
        //common apporoach to revrse a string in JAVA iby using string builder/ StringBuffer

        String str = new StringBuffer("Aman").reverse().toString(); 
        // created a string variable >> stored a stringbuffer after converting into string type , and reversed strbuffer useing reverse() function.

        System.out.println(str);

        String str2 = new StringBuilder("Nikki").reverse().toString(); 
        System.out.println(str2);
    }
    
}
