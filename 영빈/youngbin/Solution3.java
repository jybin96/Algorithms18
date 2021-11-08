package youngbin;

public class Solution3 {

	public static void main(String[] args) {
		String s = "abcdedasdasdasd";
		String answer = "";
		int remainder = s.length()/2; //몫
		int quotient = s.length()%2; //나머지
		
		System.out.println(remainder);
		System.out.println(quotient);
		if(quotient == 0) {
			answer = s.substring(remainder-1, remainder+1);
		}else {
			answer = s.substring(remainder, remainder+1);
		}
		
		System.out.println(answer);

	}

}
