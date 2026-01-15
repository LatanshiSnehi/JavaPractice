public class Day8 {
    public static void day8(String s){
        int n = s.length();
        char[] c = s.toCharArray();
        
        for(int i=0; i<n;i++){
            int j =0;
            int count = 0;
            while(j<n){
                if(c[i]==c[j]){
                    count++;
                }   
            j++;          
            }
           
            System.out.println(c[i]+"=>"+count);
        }
    }

    public static void main(String[] args){
        day8("banana");
    }
}
