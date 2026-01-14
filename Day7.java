public class Day7 {
    public static int day7(String str){
        int i = 0;
        int n = str.length();
        int count =0;
        
        while(i<n){
            char c = str.charAt(i);
            if(c=='a' || c=='e'|| c=='o' || c=='i' || c== 'u'){
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args){
        String s = "automation";
        System.out.println(day7(s));
    }
}
