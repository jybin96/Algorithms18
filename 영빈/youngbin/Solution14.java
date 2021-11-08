package youngbin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution14 {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		List<Integer> answer = new ArrayList<Integer>();
	
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%divisor == 0) {
				answer.add(arr[i]);
			}
		}
		
		if(answer.size() == 0) {
			answer.add(-1);
		}
		
		Collections.sort(answer);
		
		System.out.println(answer.stream().mapToInt(x->x).toArray());

	}

}
