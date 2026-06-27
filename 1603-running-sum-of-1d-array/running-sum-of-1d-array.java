class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        for(int i=0; i<n; i++) {
            runningSum[i] = sum(nums, i);
        }
        return runningSum;
    }

    public int sum(int[] nums, int i) {
        int n = nums.length;
        int sum=0;
        for(int j=0; j<=i; j++) {
            sum += nums[j];
        }
        return sum;
    }
}