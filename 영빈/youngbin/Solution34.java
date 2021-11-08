package youngbin;

import java.util.ArrayList;
import java.util.Collections;

public class Solution34 {

	public static void main(String[] args) {
		int[] answers =  {1,2,3,4,5};
		int count1 = 0,count2 = 0,count3 = 0;
		int[] student1 = {1,2,3,4,5}; // 5
		int[] student2 = {2,1,2,3,2,4,2,5}; //8
		int[] student3 = {3,3,1,1,2,2,4,4,5,5}; // 10
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i =0; i<answers.length; i++){
            if(student1[i%student1.length] == answers[i]) {
        
            	count1++;
            }	
            if(student2[i%student2.length] == answers[i]) {
            	
            	count2++;
            }
            	
            if(student3[i%student3.length] == answers[i]) {
            	
            	count3++;
            } 
            	
        }
		
		int max = Math.max(Math.max(count1,count2),count3);
		
		if(count1 == max) {
			list.add(1);
		}
		if(count2 == max) {
			list.add(2);
		}
		if(count3 == max) {
			list.add(3);
		}
		answers = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answers[i] = list.get(i);
		}
		System.out.println(list);
	}

}
