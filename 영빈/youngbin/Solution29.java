package youngbin;

public class Solution29 {

	public static void main(String[] args) {
		int n = 45;
		String str = "";
		int answer = 0;

		
		while(n != 0) {
			str = (n % 3) + str;
			n = n/3;
		}
		
		StringBuffer str_buffer = new StringBuffer(str);
		str = str_buffer.reverse().toString();
		
		
		answer = Integer.parseInt(str, 3);
		
	    
	    
	    System.out.println(answer);
		
		
		
	}

}
