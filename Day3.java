public class Day3 {
    public static String reverseArray(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;
        char[] revArr = new char[n];
        int j =0;
        for(int i = n-1; i>=0;i--){
            
           revArr[j] = arr[i];
            j++;
        }
        String st = new String(revArr);
        return st;
    }

    public static void main(String[] args){
        String s = "abcdk";
        System.out.println(reverseArray(s));
    }
}
