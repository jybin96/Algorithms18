package youngbin;

import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuffer phoneNum = new StringBuffer(sc.next()); //버퍼를 안사용하고 string으로 할수있지만 string이 바뀔경우에는 버퍼 사용하는게 좋아 한번 사

		System.out.println(phoneNum);
		for(int i = 0; i < phoneNum.length()-4; i++) {
			phoneNum.replace(i,i+1, "*"); //뒷 4번호 전까지 *로 고치는 내용
		}
		
		String answer = phoneNum.toString();
		
		System.out.println(answer);

	}

}
