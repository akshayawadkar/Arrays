
public class _21_Combinations {
	
	public static void main(String[] args) {
		
		int[] A = {1,2,1};
		int k = 2;
		
		solve(A, "", 0, k);
		
	}

	private static void solve(int[] arr, String curr, int idx, int k) {
		
		if(k > arr.length) {
			return;
		}
		
		if(k == 0) {
			System.out.println(curr);
			return;
		}
		
		for(int i = idx; i < arr.length; i++) {
			solve(arr, curr + arr[i], i + 1, k - 1);
		}
		
	}

}
