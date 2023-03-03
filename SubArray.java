class SubArray {
    
    public static void getSubArray(int nums[])
    {
       
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i; j<nums.length; j++)
            {
                 int sum=0;
                for(int k=i; k<=j; k++)
                {
                    System.out.print(nums[k]);
                    sum+=nums[k];
                }    
                System.out.print(" "+"#"+sum+"#"+" ");  //It will display sum of sub-array
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        getSubArray(nums);
    }
}
