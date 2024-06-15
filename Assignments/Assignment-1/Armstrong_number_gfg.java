class Solution {
    static String armstrongNumber(int n){
        // code here
        int a=n;
        int sum=0;
        while(a>0)
        {   
            int b=a%10;
            sum+=(int)Math.pow(b,3);
            a=a/10;
        }
        String s1="Yes";
        String s2="No";
        if(sum==n)
        {
          return s1; 
        }
        return s2;
    }
}