package youngbin;

import java.util.ArrayList;
import java.util.Collections;

public class Solution36 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++) {
			list.add(Character.toString(s.charAt(i)));
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		for(int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
		System.out.println(answer);
		
	}

}
