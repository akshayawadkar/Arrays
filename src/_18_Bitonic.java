import java.util.Arrays;

public class _18_Bitonic {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80, 1};
		
		int result = solve(arr);
		
		System.out.println(result);
		
	}

	private static int solve(int[] arr) {
	 
		
		int n = arr.length;
		int[] lis = new int[n];
		
		for(int i = 0; i < n; i++) {
			int max = 0;
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					max = Math.max(max, lis[j]);
				}
			}
			lis[i] = max + 1;
		}
		
		System.out.println(Arrays.toString(lis));
		
		
		int[] lds = new int[n];
		
		
		for(int i = n - 1; i >= 0; i--) {
			int max = 0;
			for(int j = n - 1; j > i; j--) {
				
				if(arr[i] > arr[j]) {
					max = Math.max(max, lds[j]);
				}
				
			}
			lds[i] = max + 1;
		}
		
		
		System.out.println(Arrays.toString(lds));
		
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			result = Math.max(result, lis[i] + lds[i] - 1);
		}
		
		return result;
	}
}
