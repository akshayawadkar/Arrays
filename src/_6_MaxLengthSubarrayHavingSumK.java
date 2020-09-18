import java.util.*;

public class _6_MaxLengthSubarrayHavingSumK {

	
	public static void main(String[] args) {
		
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		int result = maxLengthSubArray(A, sum);
		System.out.println(result);
		
	}

	private static int maxLengthSubArray(int[] arr, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int sum = 0;
		
		int  end = 0;
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
		
			sum += arr[i];
			
			if(map.containsKey(sum - k)) {
//				result = Math.max(result,  i - map.get(sum - k));
				if(result < i - map.get(sum - k)) {
					result = i - map.get(sum - k);
					end = i;
				}
			}
			
			map.putIfAbsent(sum, i);
		}
		
		System.out.println(end - result + 1 +"  " + end);
		
		return result;
	}
}
