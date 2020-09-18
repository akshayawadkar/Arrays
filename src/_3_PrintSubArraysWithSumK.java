import java.util.*;

public class _3_PrintSubArraysWithSumK {

	
	public static void main(String[] args) {
		
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		int sum = 7;
		
		
		solve(arr, sum);
	}

	private static void solve(int[] arr, int k) {
		 
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		map.put(0, lst);
		
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
			List<Integer> tmp = new ArrayList<>();
			
			
			if(map.containsKey(sum - k)) {
				
				tmp = map.get(sum - k);
				
				for(int j = 0; j < tmp.size(); j++) {
					System.out.println((tmp.get(j) + 1) +"  " + (i));
				}
				
			}
			 
			tmp.add(i);
			map.put(sum, tmp); 
		}
		
		
	}
}
