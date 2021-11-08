package youngbin;

import java.util.ArrayList;

public class Solution23 {

	public static void main(String[] args) {
		long n = 1234567891;
		long count = 1;
		int index = 0;
		int[] answer = {};
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		
		while(n/count != 0) {
			index++;
			count *= 10;
			arrlist.add((int) (n%count/(count/10)));
		}
		
		answer = arrlist.stream().mapToInt(x->x).toArray();

	}

}
