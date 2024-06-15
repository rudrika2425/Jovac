class Solution{
    int countCoPrime(int a[], int n)
    {   
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(gcd(a[i],a[i+1])!=1)
            {
              count++;
            }
        }
        return count;
    }
    
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}


