package youngbin;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n 값 받기
        int m = sc.nextInt(); // m 값 받기
        
        for(int i = 0; i < m; i++) { //행수
        	for(int j = 0; j<n; j++) {  //열수
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
