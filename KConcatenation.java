class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        
        if(k == 1) {
            return kadaneTwo(arr, 1);
        }
        
        if(arrSum < 0) {
            return kadaneTwo(arr, 2);
        } 
        
        else {
            return kadaneTwo(arr, 2) + (int)(((k-2)*arrSum) % 1000000007);
        }   
        
    }
    
    int kadaneTwo(int[] arr, int it){
        long curSum = 0;
        long oMax = 0;
        
        for(int k = 0; k < it; k++) {
            for(int i = 0; i < arr.length; i++) {
                if(curSum < 0) {
                    curSum = arr[i];
                }
                else {
                    curSum += arr[i];
                }

                if(curSum > oMax) {
                    oMax = curSum;
                }
            }
        }
        
        System.out.println(oMax);
        return (int)oMax%1000000007;
    }
}
