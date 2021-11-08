package youngbin;

import java.util.Scanner;

public class Solution17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean answer = false;
		String str = sc.next();
		String check = "[0-9]+";
		
		
		if((str.length()==4 | str.length()==6) && str.matches(check) == true)
			answer = true;
		
		
		System.out.println(answer);

	}

}
