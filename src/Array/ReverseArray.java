package Array;

public class ReverseArray {
	public static void main(String[] args) 
{	
	int arr[]= {101,4,88,9,56};
	
	//System.out.println("Elements of array : "+arr[ ]);    
	
	System.out.print("Reverse Array : ");
	
	for ( int i = arr.length-1; i >= 0; i--) 
    {     
      // arr[i];
		System.out.print(arr[i]+ " ");
    }  
	
}

}
