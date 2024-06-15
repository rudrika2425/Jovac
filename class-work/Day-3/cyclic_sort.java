import java.util.*;
public class cyclic_sort {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a[]={3,2,1,4,5};
    int i=0;
    while(i<a.length)
    {
     if(a[i]!=a[a[i]-1])
     {   
        // if the current element is not equal to the element present at the current index
		// put the element in the correct index by swapping 
        int temp=a[i];
        int idx=a[i]-1;
        a[i]=a[idx];
        a[idx]=temp;
     }
     else{
        i++;
     }
    }
    System.out.println(Arrays.toString(a));
    
    }
}
