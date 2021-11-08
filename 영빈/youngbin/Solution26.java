package youngbin;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution26 {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] answer = {};
		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); //
			int min = Collections.min(list);
			list.remove(Integer.valueOf(min));
			answer = new int[arr.length-1];
			for(int i = 0; i < arr.length-1; i++) {  //stream으로 전에 했지만 for문보다 성능이 안좋다. 그래서 for문  사용
				answer[i] = list.get(i);
				System.out.println(answer[i]);
			}
			
		}
		
		System.out.println(answer);
	}

}
