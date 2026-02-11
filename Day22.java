import java.util.HashMap;

public class Day22 {
    public static String longestSubstringTwoDistinct(String s){
        int max=0;      
        int left=0;
        int startIndex=0;
        int curr =0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right =0; right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size()>2){
                char chleft = s.charAt(left);
                map.put(chleft, map.get(chleft)-1);
                
    if(map.get(chleft) == 0){
        map.remove(chleft);
    }
                left++;
            }
            curr = right-left+1;
            if(curr>max){
                max = curr;
                startIndex = left;
            }
            
        }
        return s.substring(startIndex,startIndex+max);

    }

    public static void main(String[] args){
        System.out.println(longestSubstringTwoDistinct("eceba"));
    }
}
