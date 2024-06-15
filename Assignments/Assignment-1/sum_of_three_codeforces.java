import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{   
		    int n=sc.nextInt();
		    if((n-3)!=1 && (n-3)!=2 && (n-3)%3!=0 && (n-3)>0)
		    {
		        System.out.println("YES");
		        System.out.println("1 2 "+ (n-3));
		    }
		    else if((n-5)!=1 && (n-5)!=4 && (n-5)%3!=0 && (n-5)>0)
		    {
		        System.out.println("YES");
		        System.out.println("1 4 "+ (n-5));
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}


