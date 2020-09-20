
public class _24_MinWindowToSortPartiallySortedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,7,5,6,4,8};
		
		int min = solve(arr);
		
		System.out.println(min);
		
	}

	private static int solve(int[] arr) {
		 
		int left = -1, right = -1;
		
		
		int maxSoFar = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > maxSoFar) {
				maxSoFar = arr[i];
			}
			
			if(arr[i] < maxSoFar) {
				right = i;
			}
			
		}
		
		int minSoFar = Integer.MAX_VALUE;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			
			if(arr[i] < minSoFar) {
				minSoFar = arr[i];
			}
			
			if(arr[i] > minSoFar) {
				left =i;
			}
			
		}
		
		System.out.println(left +  " " + right);
		
		return right - left + 1;
	}

}
