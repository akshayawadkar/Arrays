import java.util.Arrays;

public class _5_FindDuplicatesInArray {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,4};
		int[] arr = {2,1,0,3};
		
		int dupli = solve(arr);
		System.out.println(dupli);
		
	}

	private static int solve(int[] arr) {
	 
		int i = 0, n = arr.length;
		
		while(i < n) {
			  
			if(arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
				swap(arr, i, arr[i] - 1);
			}else {
				i++;
			}
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		return 0; 
	}
	
	

	private static void swap(int[] arr, int left, int right) {
		int tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}

}
