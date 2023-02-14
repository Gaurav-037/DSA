// 26. Remove Duplicates from Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        
        // for(int i=0; i<nums.length-1 i++){
        //     if(nums[i]==nums[i+1]){
        //         System.out.print("_")
        //     }
        // }
        int i =1;
        int cnt =1;
        while(i<nums.length){
            if(nums[i-1]!=nums[i]){
                nums[cnt] = nums[i];
                cnt++;   
            }
            i++;
        }
        
        return cnt;
        
    }
}
