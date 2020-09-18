import java.util.*;

public class _2_SubarrayWith0Sum {

	
	public static void main(String[] args) {
		
		int[] A = { 4, -6, 3, -1, 4, 2, 7 };
//		int[] A = { -3, 4,  -1, 0};
		
		boolean result = solve(A);
		System.out.println(result);
	}

	private static boolean solve(int[] a) {
		 
		Set<Integer> set = new HashSet<>();
		set.add(0);
		
		int sum = 0;
		for(int i : a) {
			sum += i;
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		
		return false; 
	}
}
