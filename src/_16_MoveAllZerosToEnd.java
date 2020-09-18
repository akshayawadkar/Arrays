import java.util.Arrays;

public class _16_MoveAllZerosToEnd {
	
	
	public static void main(String[] args) {
		
		int arr[] = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		solve(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void solve(int[] arr) {
		 
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			if(arr[left] != 0) {
				left++;
			}else {
				swap(arr, left, right--);
			}
		}
		
		
	}
	
	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}

}
