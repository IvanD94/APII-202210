package sorting;

public class SelectionSort {
	
	void selectionSort(int arr[], int n)
	{
	    for(int i = 0; i < n; i++){
	        int min = i;
	        for (int j = i+1; j < n; j++){
	            if (arr[j] < arr[min]){
	                min = j;
	            }
	        }
	        int temp = arr[min];
	        arr[min] = arr[i];
	        arr[i] = temp;
	    }
	}
	
	void selectionSort2(int arr[], int n)
	{
	    for(int i = 0; i < n; i++){
	        int min = select(arr, i);
	        swap(arr, i, min);
	    }
	}

	int  select(int arr[], int i)
	{
		int min = i;
		for (int j = i+1; j < arr.length; j++){
			if (arr[j] < arr[min]){
				min = j;
			}
		}
		return min;
	}
	
	void swap(int arr[], int i , int j) {
		int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
	}
	
}
