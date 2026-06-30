class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > (n / 3)) {
                list.add(key);
            }
        }
        return list;
    }
}
