
public class _18_KadanesAlgo {
	
	
	public static void main(String[] args) {
		
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = maxSum(arr);
		System.out.println(sum);
		
	}

	private static int maxSum(int[] arr) {
	 
		int sumTillNow = arr[0], sumTillHere = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sumTillHere += arr[i];
			
			if(sumTillNow < sumTillHere) {
				sumTillNow = sumTillHere;
			}
			
			if(sumTillHere < 0) {
				sumTillHere = 0;
			}
		}
		
		return sumTillNow;
	}
	

}
