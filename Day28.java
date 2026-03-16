public class Day28{
    public static int[] day28(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
         int[] ans = new int[n];

        for(int i =1; i < n ;i++){
            int product =1;
            left[i] = nums[i] * nums[i-1];
            right[n-1] = nums[i] *nums[i+1];
            ans[i] = left[i]*right[i];
        }
        
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(day28(arr));
    }
}