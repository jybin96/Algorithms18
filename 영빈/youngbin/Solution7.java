package youngbin;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		int sum = 0;
		
		for(int i = 0; i < absolutes.length; i++) {
			if(signs[i] == true) {
				sum += absolutes[i];
			}else {
				sum -= absolutes[i];
			}
		}
		
		System.out.println(sum);

	}

}
