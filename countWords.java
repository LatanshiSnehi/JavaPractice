public class countWords{

    public static int countWords(String str){
        int n = str.length();
        int count = 0;

        for(int i =0; i<n ; i++){
            if(str.charAt(i) != ' ' && (i==0 || str.charAt(i-1) == ' ')){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countWords("Hello world"));
    }
}