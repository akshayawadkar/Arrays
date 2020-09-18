import java.util.Arrays;

public class _14_EquilibriumPoint {
	
	public static void main(String[] args) {
		
		int[] arr = {0, -3, 5, -4, -2, 3, 1, 0};
		
		solve(arr); 
		
	}

	private static void solve(int[] arr) {
		 
		int n = arr.length;
		
		int[] left = new int[n];
		
		left[0] = 0;
		
		for(int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i - 1];
		}
		
		System.out.println(Arrays.toString(left));
		
		
		int[] right = new int[n];
		
		right[n - 1] = 0;
		
		for(int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] + arr[i + 1];
		}
		
		System.out.println(Arrays.toString(right));
		
		
		for(int i = 0; i < n; i++) {
			if(left[i] == right[i]) {
				System.out.println(i);
			}
		}
		
	}

}
