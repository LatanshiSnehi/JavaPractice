public class isPalindrome {
    public static Boolean ispalindrome(String str){
        char[] c = str.toCharArray();
        int i =0; 
        int j = str.length()-1;
        while(i<j){
            if(c[i] != c[j]){
               
                return false;
            }
             i++;
             j--;
           
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(ispalindrome("madam"));
    }
    
}
