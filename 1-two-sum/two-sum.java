class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        
        for (int i=0; i<nums.length; i++){
            
            if(!map.isEmpty() && map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
                
                return result;
            }
            else{
                map.put(target-nums[i],i);
            }
        }return new int[]{-1, -1};
    }
}




/*
class Solution{
    public int[] twoSum(int [] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int remain = target - nums[i];

            if(map.containsKey(remain)){
                return new int[] {map.get(remain), i};
            }
            map.put(nums[i] , i);
        }
        return new int[] {-1,-1};
    }
}
*/


/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i =0; i<n; i++){
            for (int j =i+1; j<n;j++ ){
                if(nums[i]+nums[j] == target ){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
        
    }
}*/