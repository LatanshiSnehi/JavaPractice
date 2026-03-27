public class Day34 {
    public static int findMaxSum(int[] arr){
        int sum = arr[0];
        int currSum =0;
        for(int i =0; i<arr.length;i++){
            currSum += arr[i];
            sum = Math.max(sum, currSum);
            if(currSum < 0){
                currSum =0;
            }
            
        }
        return sum;
    }

    public static void main(String[] args){
        int[] ar = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSum(ar));
    }
}
