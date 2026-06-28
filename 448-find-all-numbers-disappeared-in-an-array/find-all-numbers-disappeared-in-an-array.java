class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0;
        int n = nums.length;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        for(int k=0; k<n; k++){
            if(nums[k] != k+1){
                list.add(k+1);
            }
        }

        return list;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}