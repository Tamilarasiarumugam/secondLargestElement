package assignments;
import java.util.Arrays;
public class SecondLargeElement {
	
	public static int secondLargestElement(int[] arr,int n)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[n-2];
		
//		Arrays.sort(arr);
//		return arr[n-2];
		
	}
	
	public static void main(String[] args)
	{
		int a[]= {1,5,8,10,3};
		int n=a.length;
		int ans=secondLargestElement(a,n);
		System.out.println(ans);
	}

}

