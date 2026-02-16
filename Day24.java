public class Day24 {

    public static int maxProfitcal(int[] nums){
        int maxProfit =0;
        int minimum =nums[0];
        
        for(int i =1; i < nums.length; i++){
            int profit = nums[i]-minimum;
            if(profit > maxProfit){
                maxProfit = profit;

            }

            if(nums[i]<minimum){
                minimum = nums[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] arr = {7,1,5,6,2};
        System.out.println(maxProfitcal(arr));
    }

    
}
