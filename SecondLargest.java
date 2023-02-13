// Given an array Arr of size N, print second largest distinct element from an array.

class SecondLargest {
    int largest = Integer.MIN_VALUE;
    int secLargest =Integer.MIN_VALUE;
    
    
    int print2largest(int arr[], int n) 
    {
        if(n<2){
        return -1;
        }
            
        for(int i=0; i<n; i++)
        {
            if(arr[i]>largest)
            {
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secLargest && arr[i]!=largest){
                secLargest = arr[i];
            }
        }
    
        if(secLargest== Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secLargest; 
        }
    }
}
