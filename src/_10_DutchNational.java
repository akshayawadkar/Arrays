import java.util.Arrays;

public class _10_DutchNational {

	
	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 2, 1, 0};
		
		solve(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void solve(int[] arr) {
		 
		int left = 0, right = arr.length - 1;
		
		int curr = 0;
		
		while(curr <= right) {
			
			 if(arr[curr] == 0) {
				 
				 swap(arr, left++ , curr);
				 curr++;
				 
			 }else if(arr[curr] == 2) {
				 
				 swap(arr, curr, right--);
//				 curr++;
				 
			 }else {
				 curr++;
			 }
			
			
		}
		 
	}
	
	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
