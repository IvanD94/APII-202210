package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		String [] data = in.readLine().split(" ");
		
		int [] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		
		Arrays.sort(arr);
		
		int q = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < q; i++) {
			int x = Integer.parseInt(in.readLine());
			
			int idx = binarysearchMaxMin(arr, n, x);
			
			System.out.println( idx);			
		}
		
		
		
		
	}
	
	//Retorna el indice del elemento
	static int binarysearch(int arr[], int n, int k){
        int inicio = 0;
        int fin = n - 1;
        int medio = -1;
        while (inicio <= fin){
            medio = (inicio + fin)/2;
            if(arr[medio] == k){
                return medio;
            }else if (k < arr[medio]){
                fin = medio - 1;
            }else if (k > arr[medio]){
                inicio = medio + 1;
            }
        }
        return -1;
    }
	
	static int binarysearchMaxMin(int arr[], int n, int k){
        int inicio = 0;
        int fin = n - 1;
        int medio = -1;
        while (inicio < fin){
            medio = (inicio + fin + 1)/2;
            if (arr[medio] < k){
                inicio = medio;
            }else if (arr[medio] >= k){
                fin = medio - 1;
            }
        }
        if (fin < inicio) {
        	return -1;
        } else {
        	return inicio;
        }
    }
	
}
