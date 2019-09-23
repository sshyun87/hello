package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력하세요.");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		getCal(2019, 5);
	}	
//		Calendar cal = Calendar.getInstance();
//		System.out.println("년: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
//		cal.set(2019, 7, 8);
//		System.out.println("년: " + cal.get(Calendar.YEAR));
//		System.out.println("월: " + cal.get(Calendar.MONTH));
//		System.out.println("년: " + cal.get(Calendar.YEAR));
//		System.out.println("년: " + cal.get(Calendar.YEAR));
//		
	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translatedMonth = month -1;
		cal.set(year, translatedMonth, 1);
		String[] week = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = getStartday(Calendar.DAY_OF_WEEK);
		System.out.println("       <<" + month + "월달  >>");
		for (String str : week) {
			System.out.print(" " + str);
		}
		System.out.println();
		for(int i = 1; i<sDay; i++) {
			System.out.println("%4d", i);
	}
		
	}
}
