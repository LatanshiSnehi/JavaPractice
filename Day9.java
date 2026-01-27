public class Day9 {
    public static void day9(String str){
        int n = str.length();
        char[] c = str.toCharArray();
        for(int i = 0; i<n ; i++){
            boolean seen = false;
            int count =0;
            
            for(int j =0; j<i; j++){
                if(c[i]==c[j]){
                    seen = true;
                    break;
                }
              
            }
            if(seen){
                continue;
            }

            for(int k=0; k<n;k++){
                if(c[i]==c[k]){
                    count++;
                }
                    
                }
            
            System.out.println(c[i] +"=>"+ count);
        }
        
    }

    public static void main(String[] args){
        day9("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}
