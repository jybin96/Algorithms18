import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
//    static class Solution1 {
//        public String solution(int num) {
//            String answer = (num % 2 == 0) ? "Even" : "Odd";
//            return answer;
//        }
//    }
//
//    static class Solution2 {
//        public int solution(int[] numbers) {
//            int sum = 0;
//            for (int n : numbers) {
//                sum += n;
//            }
//            int answer = 45 - sum;
//            return answer;
//        }
//    }
//
    static class SolutionArr {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }

    static class SolutionDiv {
        public List solution(int[] arr, int divisor) {
            List answer= new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]% divisor == 0) {
                    answer.add(arr[i]);
                } else{
                    continue;
                }
            }
            if(answer.size() == 0){
                answer.add(-1);
            }
            Collections.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
//        SolutionDiv sol = new SolutionDiv();
//        int[] arr = {3,2,6};
//        int divisor = 2;
//        List answer = sol.solution(arr, divisor);
//        for (Object n: answer){
//            System.out.println(n);
//        }


        //행렬 합
        SolutionArr arr = new SolutionArr();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = arr.solution(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }


        if (answer[0][0] == 4 && answer[0][1] == 6 &&
                answer[1][0] == 7 && answer[1][1] == 9) {
            System.out.println("맞았습니다.");
        } else {
            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
        }
    }
}
