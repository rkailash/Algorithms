//Return maximum sum in a window of size k
public class Maxwindowsum {
	
	public static int maxContiguousSum(int[] arr, int k) {
		int maxSum = Integer.MIN_VALUE, runningSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			runningSum += arr[i];
			
			if(i >= k-1) {
				maxSum = Math.max(maxSum, runningSum);
				runningSum -= arr[i-(k-1)];
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		System.out.println("Maximum contiguous sum :" + maxContiguousSum(a,2));		
	}
	
}
