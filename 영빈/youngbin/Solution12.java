package youngbin;

public class Solution12 {

	public static void main(String[] args) {
		
		long answer = -1;
		int price = 3;
		int money = 20;
		int count = 4;
		long sum = 0;
		
		
		for(int i=1 ; i <=count ; i++){
	           sum += (long) price*i;
	       }
	       if((long) money > sum){
//	           return 0;
	       }else{
	           answer = sum - (long) money;
//	           return answer;   
	       }

	}

}
