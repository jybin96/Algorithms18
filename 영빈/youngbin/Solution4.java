package youngbin;

public class Solution4 {

	public static void main(String[] args) {
		long a = 3;
		long b = 5;
		long smallNum = a;
		long bigNum = b;
		long answer = 0;
		
		if(a>b) {
			smallNum = b;
			bigNum = a;
		}
		
		
		for(long i=smallNum; i<=bigNum; i++) {
			answer +=i;
		}
		
		System.out.println(answer);
	}

}
