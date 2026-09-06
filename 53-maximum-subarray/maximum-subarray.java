class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        // Finding the maximum sum of a contiguous subarray.
        int n = nums.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n ; i++){
            sum += nums[i];

            if(sum>max){
                max = sum;
            }

            if(sum<0){
                sum =0;
            }
        }
        return max;



        /*
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum = sum + nums[j];
                max = Math.max(sum,max);

            }
        }return max;
        */



        /*
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                int sum = 0;
                for(int k =i;k<=j;k++){
                    sum = sum + nums[k];
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
        */
    }
}