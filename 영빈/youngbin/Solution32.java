package youngbin;

import java.util.ArrayList;

public class Solution32 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		
		for(int i = 0; i < numbers.length; i++) {
			for(int k = i+1; k < numbers.length; k++) {
				int sum = numbers[i]+numbers[k];
				if(arrlist.contains(sum) == false) {
					arrlist.add(sum);
				}
			}
		}
		arrlist.sort(null);
		System.out.println(arrlist);
		int[] answer = new int[arrlist.size()];
		for(int i = 0; i < arrlist.size(); i++) {
			answer[i] = arrlist.get(i);
		}
		
		
	}

}
