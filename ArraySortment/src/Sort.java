package ArraySortment.src;
// Java program for implementation of array sortalgorithm 
class Sort
{
	/*Function to sort array using bubble sort*/
	public void bubbleSort(int arr[]) {
		int length = arr.length;

		for (int i = 0; i < length-1; i++) {
			for (int j = 0; j < length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
            } 
        }      
	}

	/*Function to sort array using selection sort*/
	public void selectionSort(int arr[]) {
		int length = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < length-1; i++) {
			// Find the minimum element in unsorted array
			int minElement = i;
			for (int j = i+1; j < length; j++) {
				if (arr[j] < arr[minElement]) {
					minElement = j;
                }
            }

			// Swap the found minimum element with the first element
			int temp = arr[minElement];
			arr[minElement] = arr[i];
			arr[i] = temp;
		}
	}

	/*Function to sort array using insertion sort*/
	public void insertionSort(int arr[]) {
		int length = arr.length;
		for (int i = 1; i < length; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/* Prints the array */
    public static void printArray(int arr[]) {
        int length = arr.length;
        for (int i=0; i<length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	// Driver code to test above
	public static void main(String args[]) {
		Sort ob = new Sort();
		int arr1[] = {64,25,12,22,11,55,64,96};
		int arr2[] = {45,35,15,69,74,16,9,16,4};
		int arr3[] = {1,15,16,14,48,95,63,7,4,6};
		ob.bubbleSort(arr1);
		printArray(arr1);
		System.out.println("Bubble-Sorted array");
		ob.selectionSort(arr2);
		printArray(arr2);
		System.out.println("Selection-Sorted array");
		ob.insertionSort(arr3);
		printArray(arr3);
		System.out.println("Insertion-Sorted array");
	}
}
