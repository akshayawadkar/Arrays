import java.util.Arrays;
import java.util.Random;

public class _12_Shuffle {

	public static void main(String[] args) {
		

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		shuffle(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void shuffle(int[] arr) {
		 
		
		Random rnd = new Random();
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int tmp = rnd.nextInt(n - i);
			System.out.println(tmp);
			swap(arr, i, tmp);
		}
		 
	}

	private static void swap(int[] arr, int i, int j) {
		 
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}
}
