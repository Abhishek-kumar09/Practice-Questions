
class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        int sum = 0;
        
        for(int num : a) {
            sum += num;
        }
        
        // Your code here
        int kadan = kadane(a);
        for(int i =0 ; i < n; i++) {
            a[i] = a[i]*-1;
        }
        
        int revKadane = kadane(a) + sum;
        // System.out.println(kadan + " " + revKadane);
        if(revKadane == 0) {
            revKadane = sum;
        }
        return Integer.max(kadan, revKadane);
    }
    
    static int kadane(int[] arr) {
        int cur = arr[0];
        int over = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if(cur < 0) cur = num;
            else cur += num;
            
            if(cur > over) {
                over = cur;
            }
        }
        
        return over;
    }
    
}
