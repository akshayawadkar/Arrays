import java.util.*;
public class Test{
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int k = 20;
		
		int len = solve(arr, k);
		
		System.out.println(len);
		
	}

	private static int solve(int[] arr, int k) {
		
		 
		int sum = 0;
		
		int left = 0, right = 0;
		
		int len = Integer.MAX_VALUE;
		
		int end = 0;
		
		while(right < arr.length) {
			
			sum += arr[right];
			
			while(sum > k) {
				
//				len = Math.min(len, right  - left + 1);
				
				if((right - left + 1) < len) {
					len = right - left + 1;
					end = right;
				}
				
				sum -= arr[left];
				left++;
				
			}
			
			right++;
			
		}
		
		System.out.println((end - len + 1)+" "+end);
		
		return len;
	}
}