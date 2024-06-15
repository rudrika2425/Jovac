class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int n=x;
        int sum=0;
        while(n>0)
        {   
            int b=n%10;
            sum=sum*10+b;
            n=n/10;
        }
        if(sum==x)
        {
            return true;
        }
        return false;
    }
}