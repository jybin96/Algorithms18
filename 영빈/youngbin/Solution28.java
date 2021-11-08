package youngbin;

public class Solution28 {

	public static void main(String[] args) {
		int x = 11;
		int num = 0;
		boolean answer = false;
		String str = String.valueOf(x);
		String[] str_arr = str.split("");
		
		for(String temp : str_arr ) {
			num += Integer.parseInt(temp);
		}
		
		if(x%num == 0) {
			answer = true;
		}
		
		System.out.println(answer);
	}
}
