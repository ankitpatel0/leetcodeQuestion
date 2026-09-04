// class Solution {
//     public int singleNumber(int[] nums) {
//         int xor=0;
//         for(int i =0;i<nums.length;i++){
//             xor = xor^nums[i];
//         }
//         return xor;

//     }
// }
class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            long x = nums[i];

            // map.put(x, map.getOrDefault(x, 0) + 1);

            //or

            // if (map.containsKey(x)) {
            //     map.put(x, map.get(x) + 1);
            // } else {
            //     map.put(x, 1);
            // }

            // or
            Integer count = map.get(x);

            if (count == null) {
                map.put(x, 1);
            } else {
                map.put(x, count + 1);
            }
        }

        for (long x : map.keySet()) {
            if (map.get(x) == 1) {
                return (int) x;
            }
        }

        return -1;
    }
}