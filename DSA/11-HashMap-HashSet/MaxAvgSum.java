class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int r=0;
        int l=0;
        while(r<k){
            sum+=nums[r];
            r++;
        }
        double max=sum;

        while (r<nums.length) {
        sum=sum-nums[l]+nums[r];
        if (max<sum) {
            max=sum;
            l++;
            r++;
        }
        else{l++;
        r++;}
        }
        
        return (double)max/k;
    }
}