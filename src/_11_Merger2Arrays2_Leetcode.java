import java.util.Arrays;

public class _11_Merger2Arrays2_Leetcode {
	
	public static void main(String[] args) {
		
		int[] X = { 1, 2, 3, 0, 0, 0};
		int[] Y = { 2, 5, 6};

		merge(X, 3, Y, 3);
		
		
		System.out.println(Arrays.toString(X));
		System.out.println(Arrays.toString(Y));
		
		
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 int count  = m + n -  1;
		 
		 
		 --m;
		 --n;
		 
		 while(m >= 0 && n >= 0) {
		
			 if(nums1[m] > nums2[n]) {
				 nums1[count--] = nums1[m--];
			 }else {
				 nums1[count--] = nums2[n--];
			 }
			 
		 }
		 
		 while(n >= 0) {
			 nums1[count--] = nums2[n--];
		 }
		  
		
	}

	private static void swap(int[] x, int[] y, int i, int j) {
		 
		int tmp = x[i];
		x[i] = y[j];
		y[j] = tmp;
		
	}

}
