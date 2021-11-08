package youngbin;

public class Solution37 {
	
	boolean searchdecimal(int num) {
		if(num < 2) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {    //루트로 나눠서 루트 보다 큰수가 되면 아래에서 무조권 됨!
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		Solution37 sl = new Solution37();
		int answer = 0;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1 ; k < nums.length ; k++) {
					System.out.println(nums[i] + nums[j] + nums[k]);
					if(sl.searchdecimal(nums[i] + nums[j] + nums[k]) == true) {
						answer++;
					}
				}
			}
		}
		
		System.out.println(answer);

	}

}
