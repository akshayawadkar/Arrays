
public class _18_PrintKadanesAlgo {
	
	
	public static void main(String[] args) {
		
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = maxSum(arr);
		System.out.println(sum);
		
	}

	private static int maxSum(int[] arr) {
	 
		
		int sumTillNow = arr[0], sumTillHere = 0;
		
		int start = 0, end = 0, s = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			sumTillHere += arr[i];
			
			if(sumTillNow < sumTillHere) {
				start = s + 1;
				end = i;
				sumTillNow = sumTillHere;
			}
			
			if(sumTillHere < 0) {
				s = i;
				sumTillHere = 0;
			}
		}
		
		System.out.println(start+"  "+end);
		
		return sumTillNow;
	}
	

}
