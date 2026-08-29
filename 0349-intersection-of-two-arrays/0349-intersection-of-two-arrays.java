class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] vis = new int[nums2.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            if(list.contains(nums1[i])) {
                continue;
            }    
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && vis[j]==0 ){
                    list.add(nums1[i]);
                    vis[j] = 1;
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }return ans;      
    }
}