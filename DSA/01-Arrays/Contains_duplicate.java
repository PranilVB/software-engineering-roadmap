class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0,j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println("tTrue");
                }
            }
        }System.out.println("false");
    }
}