class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

    // void sort(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 1; j < arr.length - i; j++) {
    //             if (arr[j] < arr[j - 1]) {
    //                 int temp = arr[j];
    //                 arr[j] = arr[j - 1];
    //                 arr[j - 1] = temp;
    //             }
    //         }
    //     }
    // }
}