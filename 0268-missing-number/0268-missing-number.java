class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int totalsum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            
        }
        return totalsum-sum;
        

        /*
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        return -1;
        */

        
        /*
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        
        return nums.length;
        */

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