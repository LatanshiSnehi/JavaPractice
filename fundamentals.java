public class fundamentals {
   
    public static String reverseString(String input){
         //String output;
        StringBuilder s = new StringBuilder();
        for(int i = input.length() - 1; i >=0 ; i--){
            s.append(input.charAt(i));
            
        }
        return s.toString();

    }
    public static void main(String[] args){
        String str = "abccbd";
        System.out.println(reverseString(str));
    }
}

