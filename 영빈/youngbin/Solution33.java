package youngbin;

public class Solution33 {
	
	int lottoRank(int score) { //로또 당첨 순위를 리턴해주는 함
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
		int hit = 0; //맞춘 수
		int zero_count = 0; // 지워진 번호 수
		for(int i = 0; i < lottos.length; i++) { // 어차피 지워진 번호수와 맞춘 수만 안다면 최고 순위 번호와 최저 순위 번호를 알수있다.
			if(lottos[i] == 0) { // 지워진 번호 수면 다음으로 넘어간다.
				zero_count++;
				continue;
			}
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					hit++;
				}
			}
		}
		
		
		int highscore =  hit+zero_count; //최고 높은 당첨
		int lowscore = hit; // 가장 낮은 당첨
		
		Solution33 sl = new Solution33();
		answer[0] = sl.lottoRank(highscore);
		answer[1] = sl.lottoRank(lowscore);
		
		System.out.println(answer[0]+" "+ answer[1]);
	}

}
