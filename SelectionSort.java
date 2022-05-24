package searchingandsorting;

public class SelectionSort 
{public static void main(String[] args)
{
	int arr[]= {9,6,3,1,2,4,5};
	int length=arr.length;
	selectionsort(arr);
	System.out.println("The sorted element are:");
	for(int i:arr)
	{
		System.out.println(i);
	}
}

private static void selectionsort(int[] arr) {
	for(int i=0;i<arr.length-1;i++)
	{
		int index=i;
		System.out.println("Value of index:"+index);
		for(int j=i+1;j<arr.length;j++)
		{
			System.out.println("The value of j is:"+j);
			if(arr[j]<arr[index])
			{
				System.out.println("Inside the if condition");
				index=j;
			}
		}
		int smallNumber=arr[index];
		System.out.println(smallNumber);
		arr[index]=arr[i];
		System.out.println("arr[index]:"+arr[index]);
		arr[i]=smallNumber;
	}
	
}

}








