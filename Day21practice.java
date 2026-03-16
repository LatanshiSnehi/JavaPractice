import java.util.Set;
import java.util.HashSet;


public class Day21practice {
    

    public static String day21practice(String str){
        Set<Character> s = new HashSet<>();
        // int right =0; 
        int left =0;
        int max =0;
        int startIndex=0;
        for(int right =0; right < str.length(); right++){
            while(s.contains(str.charAt(right))){
                s.remove(str.charAt(left));
                left++;
            }
            
            s.add(str.charAt(right));
            int currentS = right-left+1;
            if(currentS>max){
                max= currentS;
                startIndex = left;
            }

        }

        return str.substring(startIndex , startIndex+max);


    }

    public static void main(String[] args){
        System.out.println(day21practice("abcaabb"));
    }

    
}
