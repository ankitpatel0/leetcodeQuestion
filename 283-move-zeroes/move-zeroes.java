/*class Solution {
    public void moveZeroes(int[] nums) {

        int[] s = new int[nums.length];
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]  != 0){
                s[index] = nums[i];
                index++;
            }
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = s[i];
        }

        
    }
}*/

class Solution {
    public void moveZeroes(int[] nums) {

        for(int i =0;i<nums.length;i++){

            if(nums[i] == 0){
                for(int j=i+1;j<nums.length;j++){

                    if(nums[j]  !=0){
                        nums[i] = nums[j];
                        nums[j]=0;
                        break;
                    }
                }
            }
        }
    }
}
