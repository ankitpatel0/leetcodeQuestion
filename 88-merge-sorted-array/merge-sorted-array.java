class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            temp[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            temp[k++] = nums2[i];
        }

        Arrays.sort(temp);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }

/*        ArrayList<Integer> set = new ArrayList<>();
        for(int i =0;i<m;i++){
            set.add(nums1[i]);
        }
        for(int i =0;i<n;i++){
            set.add(nums2[i]);
        }
        Collections.sort(set);
        int i =0;

        for(int j =0;j<set.size();j++){
            nums1[i++] = set.get(j);
        }

    */   
    }
}