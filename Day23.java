import java.util.HashMap;
public class Day23 {

    public static int[] twoSum(int[] arr, int target){
        int curr =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < arr.length;i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                  return new int[]{ map.get(complement), i };
                
            }
            map.put(arr[i],i);

        }
         return new int[]{}; 
    }

    public static void main(String[] args){
        int[] s = {2,7,8,9};
        int[] result = twoSum(s,9);
        System.out.println(result[0] + " " + result[1]);
    }
    
}
