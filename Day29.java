public class Day29 {
    public static int day29(int[] arr, int k){
        int n = arr.length;
        int newSum =0;
        
        for(int i =0; i < k ; i++){
            newSum += arr[i];         
        }
        int maxSum=newSum;
        for(int i =k; i <n ; i++){
          newSum = newSum-arr[i-k]+arr[i];
            if(newSum>maxSum){
                maxSum = newSum;
            }
        }
        return maxSum;
      }

      public static void main(String[] args){
        int[] nums ={1,2,3,4,5};
        int n = 3;
        System.out.println(day29(nums,n));
      }
      
}
