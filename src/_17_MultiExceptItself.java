import java.util.Arrays;

public class _17_MultiExceptItself {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int[] result = solve(arr);
		
		System.out.println(Arrays.toString(result));
		
//		
		
		 
	}

	 

	private static int[] solve(int[] arr) {
		 
		int n = arr.length;
		
		int[] left = new int[n];
		int[] right = new int[n];
		
		left[0] = 1;
		
		right[n - 1] = 1;
		
		for(int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		
		for(int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		
		int[] result = new int[n];
		
		for(int i = 0; i < n; i++) {
			result[i] = left[i] * right[i];
		}
		
		return result;
	}

}
