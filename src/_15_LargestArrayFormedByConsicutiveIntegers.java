import java.util.*;

public class _15_LargestArrayFormedByConsicutiveIntegers {
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 0, 2, 1, 4, 3, 1, 0 };
		int result = solve(arr);
		
		System.out.println(result);
	}

	private static int solve(int[] arr) {
		 
		int max = 0;
		
		Set<Integer> set = new HashSet<>();
		
		int left = 0, right = 0;
		
		while(right < arr.length) {
			
			if(set.contains(arr[right])) {
				set.remove(arr[left]);
				left++;
				
			}else {
				set.add(arr[right]);
				max = Math.max(max, set.size());
				right++;
			} 			
		}
		
		return max;
	}

}
