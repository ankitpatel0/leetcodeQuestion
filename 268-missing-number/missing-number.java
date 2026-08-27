class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;

        /*  for(int i =1;i<=n;i++){
            int flag=0;
            for(int j =0;j<n;j++){
                if(nums[j] ==i){
                    flag =1;
                    break;
                }
            }if(flag ==0)
                return i;
            
        }
        return 0;
        
        */

    }
}