class Solution {
    void zigZag(int arr[], int n) {
        
        boolean in = true;
        
        for(int i = 0;i < n-1; i++) {
            if(in && arr[i] > arr[i+1]
            || !in && arr[i] < arr[i+1]
            ) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                
            }
            in = !in;
        }
    }
}
