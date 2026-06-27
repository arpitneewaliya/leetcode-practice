class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for (int i=0; i<nums.length; i++) {
            esum += nums[i];
            int countDigits = (int) (Math.log10(nums[i]) + 1);
            int temp = nums[i];
            while (temp > 0) {
                int digit = temp%10;
                dsum += digit;
                temp = temp/10;
            }
        }
        return Math.abs(esum-dsum);
    }
}
