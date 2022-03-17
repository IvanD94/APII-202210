package sorting;

public class InsertionSort {

	void insertionSort(int arr[], int n)
	{
	    for (int i = 1; i < n; i++) {
	    	int j = i-1;
	    	int val = arr[i];
	    	while (j >= 0 && arr[j]> val) {
	    		arr[j+1] = arr[j];
	    		j--;
	    	}
	    	arr[j+1] = val;
	    }
	}
	
	
}
