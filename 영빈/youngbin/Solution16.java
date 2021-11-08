package youngbin;

public class Solution16 {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "pPoooY";
		int p_count = 0;
		int y_count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.toLowerCase(s.charAt(i)) == 'p') {
				p_count++;
			}else if(Character.toLowerCase(s.charAt(i)) == 'y') {
				y_count++;
			}
		}
		
		if(p_count != y_count) {
			answer = false;
		}
		System.out.println(answer);
		

	}

}
