package Main;

public class Main {

	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(fibo(5));
		System.out.println((-1/2) + "");
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static int fibo(int n) {
		if (n == 1 || n==2) {
			return 1;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
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
	
}
