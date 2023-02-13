// Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int count =0;
        if(n<2){
            return true;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1])
            {
               count++;
            }
            else{
                return false;
            }
        }
        
        if(count==n-1){
             return true;
        }
        else{
         return false;
        }
            
    }
}
