package youngbin;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Solution13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; // 16년 1월 1일은 금요일이기 때문에 이렇게 고쳤다.
		
		Calendar setCal = Calendar.getInstance();
		setCal.set(2016,0,1);     //2016.1.1일인 켈린더 생성
		
		Date date1 = setCal.getTime();   // 일계산을 위한 데이트 생성 -> 추후에 알게된 사실이지만 켈린더형에서 일계산이 가능하다!.
		
		Calendar setCal2 = Calendar.getInstance(); //원하는 날짜의 켈린더 생성
		setCal2.set(2016,a-1,b);
		
		Date date2 = setCal2.getTime();
		
		long differenceDay = (date2.getTime()-date1.getTime())/(60*60*24*1000); //밀리세컨드라서 1000곱해준다.
		
		System.out.println(differenceDay%7);
		System.out.println(week[(int) (differenceDay%7)]);

	}

}
