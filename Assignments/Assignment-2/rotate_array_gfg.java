class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d=d%n;
        reverse(0,d-1,arr);
        reverse(d,n-1,arr);
        reverse(0,n-1,arr);
    }
    
    public static void reverse(int start,int end,int a[])
    {
        while(start<=end)
        {
           int temp=a[start];
           a[start]=a[end];
           a[end]=temp;
           start++;
           end--;
        }
    }
}
