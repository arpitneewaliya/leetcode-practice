class Solution {
    public int findNumbers(int[] nums) {
        int count_evens=0;
        for(int i=0; i<nums.length; i++) {
            int count_digits = (int)(Math.log10(nums[i])) + 1;
            if(count_digits % 2 == 0)
                count_evens++;
        }
        return count_evens;
    }
}
