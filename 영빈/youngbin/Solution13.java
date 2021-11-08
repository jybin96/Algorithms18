package youngbin;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Solution13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		
		Calendar setCal = Calendar.getInstance();
		setCal.set(2016,0,1);
		
		Date date1 = setCal.getTime();
		
		Calendar setCal2 = Calendar.getInstance();
		setCal2.set(2016,a-1,b);
		
		Date date2 = setCal2.getTime();
		
		long differenceDay = (date2.getTime()-date1.getTime())/(60*60*24*1000);
		
		System.out.println(differenceDay%7);
		System.out.println(week[(int) (differenceDay%7)]);

	}

}
