class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int temp;
        int i=0;
        int j=0;
        int k=n-1;
        while (j<= k){
            if (nums[j]==0){
                temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if (nums [j]==1){
                j++;
            }
            else { 
            temp= nums[j];
            nums[j]=nums[k];
            nums[k]= temp;
            k--;
            }
            
        }
    }
}