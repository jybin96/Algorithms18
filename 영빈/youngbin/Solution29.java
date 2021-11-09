package youngbin;

public class Solution29 {

	public static void main(String[] args) {
		int n = 45;
		String str = "";
		int answer = 0;
		
		
		while(n != 0) {  //3진법으로 바꾸어 주는 부분 
			str = (n % 3) + str;
			n = n/3;
		}
		
		StringBuilder str_buffer = new StringBuilder(str); //reverse()함수를 사용하기위해 stringbuffer나 stringbuilder를 사용하면된다! 동기화 고려하지않거나 멀티 쓰래드 환경 아니면 stringbuilder사용한다.
		str = str_buffer.reverse().toString();
		
		
		answer = Integer.parseInt(str, 3);  //다른 진수를 10진법으로 바꿀때는 parseint사용가능!
		
	    
	    
	    System.out.println(answer);
		
		
		
	}

}
