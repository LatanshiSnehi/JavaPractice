public class Day32 {

    public static int removeDuplicates(int[] arr){
        int pos= 0;
        for(int i =0; i<arr.length; i++){
           if(arr[i]!=arr[pos]){
            pos++;
             arr[pos] = arr[i];
           }
        }   
        return pos + 1;    
    }

    public static void main(String[] args){
        int[] ar = {1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(ar));
    }
    
}
