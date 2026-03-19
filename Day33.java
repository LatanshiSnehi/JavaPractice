public class Day33 {
    public static int removeElement(int[] arr, int val){
        int pos =0;
        for(int i =0; i < arr.length;i++){
            if(arr[i]!=val){
                arr[pos] = arr[i];
                pos++;
            }
        }
        return pos;
    }

    public static void main(String[] args){
        int[] ar = {5,1,5,2,5};
        int va=5;
        System.out.println(removeElement(ar, va));
    }
}
