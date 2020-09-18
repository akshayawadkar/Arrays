
public class _21_MaxSubArrayOfSizek {

	public static void main(String[] args) {
		
		int arr[] = { 10, 4, 2, 5, 6, 3, 8, 1 };
		int k = 3;
		
		int result = solve(arr, k);
		
		System.out.println(result);
		
	}

	private static int solve(int[] arr, int k) {
		
		int max = 0;
		
		int left = 0, right = 0;
		int sum = 0;
		
		while(right < arr.length) {
			
			sum += arr[right];
			
			while(right - left + 1 > k) {
				sum -= arr[left];
				left++;
			}
			
			if(right - left + 1 == k)
				max = Math.max(max, sum);
			
			right++;
		}
		
		return max;
	}
	
}
