package Array;

public class SortDescendingArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {101,4,88,9,56};
		int temp=0;
		System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++)
        {
        	for(int j=i+1;j<arr.length; j++)
        	{     
        		if (arr[i]<arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        		
        	}
        	System.out.print(arr[i]+" ");
        }
	}
}
