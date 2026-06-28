class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            list.add(num);
        }
        
        for (int num : nums2) {
            list.add(num);
        }

        int[] merged = new int[list.size()];

        for (int i=0; i<merged.length; i++) {
            merged[i] = list.get(i);
        }

        Arrays.sort(merged);

        int n = merged.length;
        double median = 0.0;

        if (n % 2 == 0) {
            median = (merged[(n-1)/2] + merged[n/2])*0.5;
        } else {
            median = merged[n/2];
        }

        return median;
    }
}