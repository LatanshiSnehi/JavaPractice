public class Day20 {
    public static char countFreq(String str){
        char ans = '\0';
        int max =0;
        int[] freq = new int[256];
        for(int i =0; i<str.length()-1;i++){
            char c = str.charAt(i);
            freq[c]++;
        }

        
       for(int i =0; i<str.length()-1;i++){
        char c = str.charAt(i);
         if(freq[c]>max){           
            max = freq[c];
            ans = c;
        }
      
       }
       return ans;
    }

    public static void main(String[] args){
        System.out.println(countFreq("suga"));
    }
    
}
