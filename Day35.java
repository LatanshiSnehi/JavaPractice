
import java.util.HashMap;

public class Day35 {
    public static int majorityElement(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i <arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i])> arr.length/2){
            return arr[i];
        }
        }
        return -1;
        
    } 

    public static void main(String[] args){
        int[] arr1 ={1,2,1,3,3,3};
        System.out.println(majorityElement(arr1));
    }
}
