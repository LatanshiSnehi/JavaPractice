public class CountDigit {

    public static int countDigit(String str){
        //ar c = str.charAt();
        int count =0;
        for(int i =0; i<str.length();i++){
            char c = str.charAt(i);
            if(c>='0' && c <='9'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countDigit("a1bsv32432"));
    }
    
}
