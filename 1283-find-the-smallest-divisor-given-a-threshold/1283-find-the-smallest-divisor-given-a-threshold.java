class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for (int i=0; i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int ans=high;
        while (low<=high)
        {
            int mid=(low+high)/2;
        int sum=0;
        for (int i=0; i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        if (sum>threshold)
        {
            low=mid+1;
        
        }
        else 
        {
           ans=mid;
            high=mid-1;
        }
        }
        return ans;
    }
}