package youngbin;

public class Solution8 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double sum = 0.0;
		double answer = 0.0;
		
		for(int num : arr) {
			sum += num;
		}
		
		answer = sum/arr.length;
		
		System.out.println(answer);

	}

}
