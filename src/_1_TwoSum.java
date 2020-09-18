import java.util.Arrays;

public class _1_TwoSum {
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {8, 7, 2, 5, 3, 1};
		
		boolean result = solve(arr, 10);
		System.out.println(result);
		
	}

	private static boolean solve(int[] arr, int target) {
		 
		Arrays.sort(arr);
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return true;
			}
			
			if(sum > target) {
				right--;
			}else {
				left++;
			}
			
		}
		
		return false;
	}

}
