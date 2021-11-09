package youngbin;

import java.util.Scanner;

public class Solution17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean answer = false;
		String str = sc.next();
		String check = "[0-9]+"; //정규표현식 생성 -> 0~9까지의 숫자가 한번 이상 나오는 정규
		
		
		if((str.length()==4 | str.length()==6) && str.matches(check) == true) //이 정규표현식을 따르고 있는지 matches함수로 체크한다.
			answer = true;
		
		
		System.out.println(answer);

	}

}
