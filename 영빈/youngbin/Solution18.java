package youngbin;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution18 {
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		int index = Arrays.asList(seoul).indexOf("Kim");
		String answer = "김서방은 "+index+"에 있다";
		
		System.out.println(answer);
		
	}
}
