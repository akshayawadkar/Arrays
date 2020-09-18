import java.util.Arrays;

public class _13_RearrangeArrayAsHighLow {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int[] result = solve(arr);
		System.out.println(Arrays.toString(result));
		
	}

	private static int[] solve(int[] arr) {
	 
		Arrays.sort(arr);
		
		int[] result = new int[arr.length];
		
		int i = 0, j = result.length - 1;
		
		int curr = 0;
		boolean flag = true;
		
		while(curr < result.length) {
			
			if(flag) {
				flag = false;
				result[curr] = arr[i];
				i++;
			}else {
				flag = true;
				result[curr] = arr[j];
				j--;
			}
			curr++;
			
		}
		
		return result;
	}

}
