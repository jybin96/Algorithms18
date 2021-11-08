package youngbin;

public class Solution22 {

	public static void main(String[] args) {
		int n = 123;
		int count = 1;
		int answer = 0;
		
		while(n/count != 0) {
			count *= 10;
			answer += n%count/(count/10);
		}
	}

}
