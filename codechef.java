import java.util.*;
public class codechef {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<t;j++){
                a[i]=sc.nextInt();
            }
            int c=0;
            for (int k=0;k<t;k++){
                for (int l = k+ 1; l< t; l++) {
                    if (a[k] == a[l]) {
                         
                        c++;
                    }
                }
                System.out.println( c);

            }
        } 
        sc.close();
    }

    
}
/*// Java program to count frequencies of array items
import java.util.Arrays;

class GFG
{
public static void countFreq(int arr[], int n)
{
	boolean visited[] = new boolean[n];
	
	Arrays.fill(visited, false);

	// Traverse through array elements and
	// count frequencies
	for (int i = 0; i < n; i++) {

		// Skip this element if already processed
		if (visited[i] == true)
			continue;

		// Count frequency
		int count = 1;
		for (int j = i + 1; j < n; j++) {
			if (arr[i] == arr[j]) {
				visited[j] = true;
				count++;
			}
		}
		System.out.println(arr[i] + " " + count);
	}
}

// Driver code
public static void main(String []args)
{
	int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
	int n = arr.length;
	countFreq(arr, n);
}
}

// This code contributed by Adarsh_Verma.
 */
