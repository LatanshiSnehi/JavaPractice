class MaxFreq{
    public static char maxFreq(String str){
        int[] freq= new int[256];
        int max =0; 
        char cc= '\0';
        for(int i =0; i<str.length(); i++){
           char t = str.charAt(i);
           freq[t]++;

            }

        for(int i =0; i < str.length();i++){
            char t = str.charAt(i);
            if(freq[t]>max){
                max = freq[t];
                cc = t;
            }
        }
        
        return cc;
    }

    public static void main(String[] args){
        System.out.println(maxFreq("banana"));
    }
}