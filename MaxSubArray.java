class MaxSubArray
{
    public static void getSubArray(int nums[])
    {
       int sum=0;
       int maxSum= Integer.MIN_VALUE;
       int prefix[] = new int[nums.length];
       
       //calculate prefix array
       prefix[0] = nums[0];
       for(int i=1; i<nums.length; i++){
           prefix[i] = prefix[i-1]+nums[i];
       }
       
        for(int i=0; i<nums.length; i++)  
        {
            for(int j=i; j<nums.length; j++)  
            {
                 sum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
            
                 if(maxSum < sum)
                    {
                        maxSum =sum;
                    }
            }
        }
        System.out.print("Max Sum is: "+maxSum);
    }
    
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        getSubArray(nums);
    }
}
