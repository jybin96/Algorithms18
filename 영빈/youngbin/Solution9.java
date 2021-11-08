package youngbin;

import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuffer phoneNum = new StringBuffer(sc.next());

		System.out.println(phoneNum);
		for(int i = 0; i < phoneNum.length()-4; i++) {
			phoneNum.replace(i,i+1, "*");
		}
		
		String answer = phoneNum.toString();
		
		System.out.println(answer);

	}

}
