class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long a[]=new Long[2];
        a[1]=gcd(A,B);
        a[0]=(A*B)/gcd(A,B);
        return a;
        
    }
    public static Long gcd(Long a,long b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
};