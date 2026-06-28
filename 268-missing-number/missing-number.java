class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i];
            if (nums[i] < n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int k = 0; k < n; k++) {
            if(nums[k] != k) {
                return k;
            }
        }

        return n;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}