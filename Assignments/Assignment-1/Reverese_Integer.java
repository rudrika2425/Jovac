class Solution {
    public int reverse(int x) {
        int a=x;
        long sum=0;
        if(x<0)
        {
            a=-x;
        }
        while(a>0)
        {
         int b=a%10;
         sum=sum*10+b;
         if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE)
        {
            return 0;
        }
         a=a/10;
        }
        if(x<0)
        {
         sum=-sum;
        }
        
        return (int)sum;
    }
}
