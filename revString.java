public class revString{
     public static Character revstring(String s){
        char[] c = s.toCharArray();
        int n = s.length();
        for(int i =0; i<n; i++){
            int count = 0;
            for(int j =0; j<n; j++){
                if(c[i] == c[j]){
                   count++;                 
                }
            }
        if(count==1){
            return c[i];
        }
        }
        return '\0';

     }

     public static void main(String[] args){
        String st = "abcxabcabc";
        System.out.println(revstring(st));
     }
}
