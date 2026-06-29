class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        // Build the hashmap -> containing frequency of each element in the array.
        for (int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > Math.floor(n/2)) {
                return key;
            }
        }

        return 1;
    }
}
