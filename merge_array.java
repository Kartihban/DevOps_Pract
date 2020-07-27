//merge-two-arrays-into-single-sorted-array-without-duplicates-in-java/


import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Merge 
{   
    private static int[] rmdup(int[] a, int[] b)
    {
        int[] mArr = new int[a.length + b.length];
        int i=0, j=0, k=0;
        while (i < a.length)
        {
            mArr[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length)
        {
            mArr[k] = b[j];
            k++;
            j++;
        }
        Set<Integer> nodup = new HashSet<>();
        for (int m = 0; m < mArr.length; m++) 
        {
            nodup.add(mArr[m]);
        } 
        Iterator<Integer> it = nodup.iterator();
        int[] wdup = new int[nodup.size()];
        int n = 0;
        while (it.hasNext()) 
        {
            wdup[n] = it.next();
            n++;
        }
        Arrays.sort(wdup); 
        return wdup;
    }
     
    public static void main(String[] args)
    {
       // int[] a = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
         
       // int[] b = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
	int n,n1;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	int a[] = new int[n];
        for(int i=0;i<n;i++)
	{
		a[i]= s.nextInt();
	}
	n1 = s.nextInt();
	int b[] =new int[n1];
	for(int i=0;i<n;i++)
	{
		b[i]= s.nextInt();
	}
        int[] mArr = rmdup(a, b);
         
       // System.out.println("Array A : "+Arrays.toString(a));
         
       // System.out.println("Array B : "+Arrays.toString(b));
         
       // System.out.println("Sorted Merged Array With No Duplicates : ");
         
       // System.out.println(Arrays.toString(mArr));
	for(int i=0;i<n1+n;i++)
	{
		System.out.println(mArr[i]+" ");
	}
    }
}
