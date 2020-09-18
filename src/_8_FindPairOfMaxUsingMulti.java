import java.util.Arrays;

public class _8_FindPairOfMaxUsingMulti {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = { -10, -3, 5, 6, -2 };

//		int result = findMaximumProduct(arr);
//		System.out.println(result);
		
		
		int result = solve(arr);
		System.out.println(result);
		
		
		
		
	}

	private static int solve(int[] arr) {
		 
		
		int max1 = arr[0], max2 = Integer.MIN_VALUE;
		
		int min1 = arr[0], min2 = Integer.MAX_VALUE;
		
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2) {
				max2 = arr[i];
			}
			
			
			if(arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			}else if(arr[i] < min2) {
				min2 = arr[i];
			}
			
			
		}
		
		return Math.max(max1 * max2, min1 * min2);
	}

	private static int findMaximumProduct(int[] arr) {
		 
		Arrays.sort(arr);
		
		return Math.max(arr[0] * arr[1],  arr[arr.length - 2] * arr[arr.length - 1]);
	}

}
