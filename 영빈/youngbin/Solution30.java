package youngbin;

import java.util.Arrays;
import java.util.Collections;

public class Solution30 {

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int temp = 0;
		int big_witdh = 0;
		int big_height = 0;
		for(int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
			if(sizes[i][0] > big_witdh) {
				big_witdh = sizes[i][0];
			}
			if(sizes[i][1] > big_height) {
				big_height = sizes[i][1];
			}
		}
		
		System.out.println(big_height*big_witdh);
		
		
	}

}
