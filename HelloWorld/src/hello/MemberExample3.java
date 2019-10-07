package hello;

import java.util.Scanner;

public class MemberExample3 {
	static Member[] memberAry = new Member[10];
	static Scanner sc = new Scanner(System.in);
	private static String memberCourse;
	private static String memberNo;

	public static void main(String[] args) {
	private static void createMember() {
		System.out.println("creatmember()");
		System.out.println("이름 입력:");
		String memberName = sc.nextLine();
		System.out.println("memberNo 입력:");
		String memberId = sc.nextLine();
		System.out.println("course 입력:");
		int memberAge = sc.nextInt();
		Member memb = new Member(memberName, memberCourse, memberNo);
		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = memb;
				break;
			}
			}
	}
		

	}
}
