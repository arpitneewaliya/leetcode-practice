class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = 1;
            } else if (nums[i] < 0) {
                nums[i] = -1;
            } else {
                return 0;
            }
            prod = prod * nums[i];
        }
        return signFunc(prod);
    }

    private int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        }
        return 0;
    }
}
