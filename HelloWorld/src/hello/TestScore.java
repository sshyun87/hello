package hello;

import java.util.Scanner;

public class TestScore {

	private static boolean run;

	public static void main(String[] args) {
		Student [] sdAry = new Student[10];
		Scanner sc = new Scanner(System.in);
		public static void scores() {
		boolean run = true;	
		while(run);
		    System.out.println("학생 번호를 입력하시오.");
			int sNumber = sc.nextInt();
			System.out.println("이름을 입력하시오.");
			String sName = sc.nextLine();
			System.out.println("국어 점수를 입력하시오.");
			int s1 = sc.nextInt();
			System.out.println("영어 점수를 입력하시오.");
			int s2 = sc.nextInt();
			System.out.println("수학 점수를 입력하시오.");
			int s3 = sc.nextInt();
			Student sd = new Student (sNumber, sName, s1, s2, s3);
			for (int i =0; i<sdAry.length; i++) {
				if(sdAry[i] == null) {
				   sdAry[i] = sd;
				   break;
				}
			}
		}
		int [] scores1 = null;
		int sum = 0;
		double avg = 0.0;
		for (int i=0; i<scores1.length; i++) {
			sum += scores1[i];
		}
		avg = (double) sum/scores1.length;
	
		int menu = 0;
		while(run) {
			System.out.println("1.학생번호 2.이름 3.국어 4.영어 5.수학 6.총점 7.평균");
			menu = sc.nextInt();
			if (menu==1) {
				getsNumber();
			}else if(menu==2) {
				getsName();
			}else if(menu==3) {
				getS1();
			}else if(menu==4) {
				getS2();
			}else if(menu==5) {
				getS3();
			}else if(menu==6) {
				sum();
			}else if(menu==7) {
				avg();
			}
		}
	}

	private static void avg() {
		// TODO Auto-generated method stub

	}

	private static void sum() {
		// TODO Auto-generated method stub

	}

	private static void getS3() {
		// TODO Auto-generated method stub

	}

	private static void getS2() {
		// TODO Auto-generated method stub

	}

	private static void getS1() {
		// TODO Auto-generated method stub

	}

	private static void getsNumber() {

	}

	private static void getsName() {

	}

}
