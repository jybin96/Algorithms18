package youngbin;

public class Solution27 {

	public static void main(String[] args) {
		long number = 626331;
		System.out.println(number);
		int count = 0;
		while(number != 1) {
			count++;
			if(count > 500) {
				count = -1;
				break;
			}
			if(number%2 == 0) {
				number = number/2;
				System.out.println(number+"->");
				System.out.println("count: "+count);
			}else {
				number = number*3+1;
				System.out.println(number+"->");
				System.out.println("count: "+count);
			}
		}
		
		System.out.println(number);
	}

}
