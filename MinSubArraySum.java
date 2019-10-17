public class MinSubArraySum {
	
	public static int findMinSubArray(int[] arr, int s) {
		int win_start=0, win_end,win_sum = 0;
		int min_length = Integer.MAX_VALUE;		
		for(win_end=0;win_end < arr.length;win_end++) {
			win_sum += arr[win_end];
			while(win_sum >= s) {
				min_length = Math.min(min_length,win_end - win_start + 1);
				win_sum -= arr[win_start];
				win_start++;
			}
		}
		
		return min_length == Integer.MAX_VALUE ? 0 : min_length;
	}

	public static void main(String[] args) {
		int[] a = {2,3,1,2,4,3};
		System.out.println(findMinSubArray(a,7));
	}

}
