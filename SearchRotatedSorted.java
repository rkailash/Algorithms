public class SearchRotatedSorted {
	
	public static int search(int[] arr, int target) {
		if(arr.length == 0 || arr == null) return -1;
		
		int left = 0, right = arr.length - 1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) return mid;
			
			if(arr[mid] <= arr[right]) {
				if(target > arr[mid] && target <= arr[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if(target < arr[mid] && target >= arr[left]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7,0,1,2,3,4,5,6};
		System.out.println(search(a,7));
	}

}
