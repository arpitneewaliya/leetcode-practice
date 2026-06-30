class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int x : nums2) {
            int count = map.getOrDefault(x, 0);
            if (count > 0) {
                list.add(x);
                map.put(x, count-1);
            }
        }

        int[] res = new int[list.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}