class BubbleSort 
{
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) 
        {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {88, 45, 47, 36, 68, 52, 12, 1, 255};
		ob.bubbleSort(arr);
		System.out.println("After Sorting:");
		ob.printArray(arr);
	}
}
