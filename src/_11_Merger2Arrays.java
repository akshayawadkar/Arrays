import java.util.Arrays;

public class _11_Merger2Arrays {
	
	public static void main(String[] args) {
		
		int[] X = { 1, 4, 7, 8, 10 };
		int[] Y = { 2, 3, 9 };

		merge(X, Y);
		
		
		System.out.println(Arrays.toString(X));
		System.out.println(Arrays.toString(Y));
		
		
	}

	private static void merge(int[] x, int[] y) {
		 
		int m = x.length, n = y.length;
		
		for(int i = 0; i < m; i++) {
			
			if(x[i] > y[0]) {
				swap(x, y, i, 0);
				
				int first = y[0];
				int k;
				for(k = 1; k < n && y[k] < first; k++) {
					y[k - 1] = y[k];
				}
				y[k - 1] = first;
			}
			
		}
		
		
	}

	private static void swap(int[] x, int[] y, int i, int j) {
		 
		int tmp = x[i];
		x[i] = y[j];
		y[j] = tmp;
		
	}

}
