package youngbin;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution24 {

	public static void main(String[] args) {
		long n = 118372;
		long answer = 0;
		long count = 1;
		int index = 0;
		String str = "";
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		
		while(n/count != 0) {
			index++;
			count *= 10;
			arrlist.add((int) (n%count/(count/10)));
		}
		
		arrlist.sort(Comparator.reverseOrder());
		
		for(int i = 0 ; i < arrlist.size(); i++) {
			str +=arrlist.get(i).toString();
		}
		
		answer = Long.parseLong(str);
		System.out.println(answer);

	}

}
