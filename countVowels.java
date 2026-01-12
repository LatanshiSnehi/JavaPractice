public class countVowels {

    public static Integer CountVowels(String str){
        int count = 0;
        char[] c= str.toCharArray();
        int n = c.length;
        for(int i = 0; i<n; i++){
            if(c[i]=='a' || c[i]=='i' || c[i]=='e' || c[i]=='o' || c[i]=='u'){
                count = count+1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "nsbxaaajdie";
        System.out.println(CountVowels(s));
    }
    
}
