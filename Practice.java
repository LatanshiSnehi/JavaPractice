public class Practice {
    public static String practice(String s){
      char[]c = s.toCharArray();
      int n = s.length();
      boolean seen = false;
      for(int i =0; i <n ; i++){
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

        for(int k =0; k <n ; k++){
            if(c[i]==c[k]){
                count++;
            }
        }
         return c[i] + "=>" + count;
      }
     
    }

    public static void main(String[] args){
        practice("banana");
    }
}
