package youngbin;

import java.util.ArrayList;
import java.util.Collections;

public class Solution35 {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		String[] answer = new String[strings.length];
		ArrayList<String> list = new ArrayList<String>();
		int n = 1;
		
		for(String str : strings) {
			list.add(Character.toString(str.charAt(n))+str);
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).substring(1);
		}
		System.out.println(list);
		
		
		

	}

}
