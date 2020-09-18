import java.util.*;

public class _7_FindMaxSubarrayHavingEqual01 {
	
	public static void main(String[] args) {
		
		int[] arr = {0,0,1,0,1,0,0};
		
		int max = solve(arr);
		System.out.println(max);
		
	}

	private static int solve(int[] arr) {
	 
		int result = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int sum = 0;
		int ending = 0;
		for(int i = 0; i < arr.length; i++) {
			
			sum += (arr[i] == 1 ? 1 : -1);
			
			if(map.containsKey(sum)) {
				
				if(i - map.get(sum) > result) {
					result = i - map.get(sum);
					ending = i;
				}
				
			}
			
			map.putIfAbsent(sum, i);
			
		}
		
		System.out.println((ending - result + 1)+ " " + ending);
		
		return result;
	}
	
	 

}
