package hello;

public class Calender9 {
	public static void main(String[] args) {
		showCal(9);
	}

	public static void showCal(int mon) {
		String[] week = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int month = 8;
		int monthDay = getMonthday(month);
		int sDay = 3;//getStartday(month);
		//요일 타이틀 출력
		for (int i = 0; i <week.length; i++) {
			System.out.println(" "+ week[i]);
		}
		System.out.println();
		//1일의 위치 지정.
		for (int i = 1; i<sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i<=monthDay; i++) {
		}
		for(int i = 1; i<=monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1)%7 ==0)
				System.out.println();
			
//	    int a = 1;
//		for(int i = 0; i<35; i++) {
//			System.out.printf("%3d", a++);
//			if(a%7==1)
//				System.out.println();
//		}
		}
	}

	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}
}