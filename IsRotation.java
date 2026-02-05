public class IsRotation{
public static boolean isRotation(String s1, String s2) {
    if(s1.length() == s2.length()){
        String combined = s1+s1;
        if(combined.contains(s2)){
            return true;
        }      
    }
     return false;  
}

public static void main(String[] args){
    System.out.println(isRotation("abcd","cdab"));
}
}
