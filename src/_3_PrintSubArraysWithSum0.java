import java.util.*;

public class _3_PrintSubArraysWithSum0 {

	
	public static void main(String[] args) {
		
//		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		int[] A = { -3, 4,  -1, 0};
		
		solve(A);
	}

	private static void solve(int[] arr) {
		 
		
		Map<Integer, List<Integer>> map = new HashMap<>();
		
		List<Integer> lst = new ArrayList<>();
		lst.add(-1);
		map.put(0, lst);
		
		
		int sum = 0;
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
			 
			
			List<Integer> al = new ArrayList<>();
			
			if(map.containsKey(sum)) {
				
				al = map.get(sum);
				
				for(int j = 0; j < al.size(); j++) {
					System.out.println((al.get(j) + 1) +"  "+i);
				}
				
				
			}else {
				al.add(i);
				map.put(sum, al);
			}
			
		}
		
		
	}
}
