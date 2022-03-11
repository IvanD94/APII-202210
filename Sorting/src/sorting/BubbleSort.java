package sorting;

public class BubbleSort {
	
	void bubbleSort(int arr[], int n)
	{
	    for (int i = 0; i < n; i++) {
	    	for (int j = 1; j < n -i; j++) {
	    		if (arr[j] < arr[j-1]) {
	    			int temp = arr[j];
	    	        arr[j] = arr[j-1];
	    	        arr[j-1] = temp;
	    		}
	    	}
	    }
	}
	
	void buubleSort2(int arr[], int n) {
		for (int i = 0; i < n; i++) {
	    	for (int j = 1; j < n -i; j++) {
	    		if (arr[j] < arr[j-1]) {
	    			swap(arr, j, j-1);
	    		}
	    	}
	    }
	}
	
	void bubbleSortOptimize(int arr[], int n) {
		boolean inversion = true;
		for (int i = 0; i < n && inversion; i++) {
			inversion = false;
	    	for (int j = 1; j < n -i; j++) {
	    		if (arr[j] < arr[j-1]) {
	    			swap(arr, j, j-1);
	    			inversion = true;
	    		}
	    	}
	    }
	}
	
	void swap(int arr[], int i , int j) {
		int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
	}

}
