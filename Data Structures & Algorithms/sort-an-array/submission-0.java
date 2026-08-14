class Solution {
    public int[] sortArray(int[] nums) {
        for (int i=1; i<nums.length;i++){
            int curr=nums[i];
            int pre=i-1;
            while(pre>=0 && nums[pre]>curr){
                nums[pre+1]=nums[pre];
                pre--;
            }
            nums[pre+1]=curr;
        }
        return nums;
    }
    
}