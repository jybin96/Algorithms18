package youngbin;

public class Solution33 {
	
	int lottoRank(int score) {
		int rank = 0;
		
		if(score == 6) {
			rank = 1;
		}else if(score == 5) {
			rank = 2;
		}else if(score == 4) {
			rank = 3;
		}else if(score == 3) {
			rank = 4;
		}else if(score == 2) {
			rank = 5;
		}else {
			rank = 6;
		}
		
		
		return rank;
	}

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer = new int[2];
		int hit = 0;
		int zero_count = 0;
		for(int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				zero_count++;
			}
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					win_nums[j] = -1;
					hit++;
				}
			}
		}
		
		
		int highscore =  hit+zero_count;
		int lowscore = hit;
		
		Solution33 sl = new Solution33();
		answer[0] = sl.lottoRank(highscore);
		answer[1] = sl.lottoRank(lowscore);
		
		System.out.println(answer[0]+" "+ answer[1]);
	}

}
