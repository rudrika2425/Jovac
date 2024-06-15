class Solution {
    public void moveZeroes(int[] nums) {
        //int a[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {  
                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
                c++;
            }
            
        }
        System.out.println(Arrays.toString(nums));
        
    }
}