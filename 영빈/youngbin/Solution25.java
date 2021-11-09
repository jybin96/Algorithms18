package youngbin;

public class Solution25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 3;
		double sqrt = Math.sqrt(n); //n의 제곱근은 sqrt에 저
		long answer = 0;
		
		if(sqrt%1 == 0.0) { //제곱근이 소수가 아니라면
			answer = (long) ((sqrt+1)*(sqrt+1));
		}else {
			answer = -1;
		}
		System.out.println(answer);

	}

}
