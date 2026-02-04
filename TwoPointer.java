public class TwoPointer {

    public static String twoPointer(String str){
        char[] arr = str.toCharArray();
        int i =0;
        int j = str.length()-1;
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }   
        return new String(arr);
     }

     public static void main(String[] args){
        System.out.println(twoPointer("jsgddg"));
     }
    
}
