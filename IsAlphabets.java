public class IsAlphabets {

    public static boolean isAlphabets(String str){
        //ar c = str.charAt();
        int count =0;
        for(int i =0; i<str.length();i++){
            char c = str.charAt(i);
            if(!(c>='A' && c <='Z') || (c>='a' && c <='b') ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isAlphabets("udshadjkhasj"));
    }
    
}
