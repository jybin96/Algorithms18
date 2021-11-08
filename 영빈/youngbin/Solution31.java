package youngbin;

import java.util.ArrayList;

public class Solution31 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int pre_num = -1;
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(pre_num != arr[i]) {
				pre_num = arr[i];
				arrlist.add(arr[i]);
			}
		}
		int[] answer = new int[arrlist.size()];
		
		for(int i = 0; i < arrlist.size(); i++) {
			answer[i] = arrlist.get(i);
		}
		
		System.out.println(arrlist);
		
	}

}
