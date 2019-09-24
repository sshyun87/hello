package hello;

import java.util.Scanner;

public class MemberExample2 {
	static Member[] memberAry = new Member[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while (run) {
			System.out.println("-----------------");
			System.out.println("1.생성 2.전체리스트 3.id, password 4. 종료");
			System.out.println("-----------------");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createName();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				checkId();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("종료");
	}

	private static void checkId() {

		System.out.println("ID입력: ");
		String memberId = sc.nextLine();
		System.out.println("Password입력: ");
		String memberPw = sc.nextLine();
		boolean isId=false, isPw=false;
		String name = null;
		int age = 0;
		//id, passwd 같으면 이름, 나이를 출력.
		//id 맞고, passwd가 다르면 비밀번호가 잘못됐습니다.
		//id 다르고, passwd 다르면 =>존재하지 않는 아이디입니다.
		for (Member memb : memberAry) {
			if (memb != null && memb.getId().equals(memberId)) {
				if (memb.getPassword().equals(memberPw)) { //id(O),pw(O)
					isId = true;
					isPw = true;
					name = memb.getName();
					age = memb.getAge();		
				}
				//System.out.println(memb.getName() + ", " + memb.getAge());
				else {//id(O), pw(X)
					isId = true;
					isPw = false; break;
				}
			}else {
				isId = false;
				isPw = false;
			}
			} if (isId==true && isPw ==true)
				System.out.println("이름은: "+ name +", 나이는: "+age);
			else if (isId == true && isPw == false)					
				System.out.println("패스워드를 잘못 입력하셨습니다.");
			else if (isId == false && isPw == false) {
				System.out.println("존재하지 않는 ID입니다.");
				}
	}

	private static void createName() {
		System.out.println("creatmember()");
		System.out.println("이름 입력:");
		String memberName = sc.nextLine();
		System.out.println("id 입력:");
		String memberId = sc.nextLine();
		System.out.println("password 입력:");
		String memberPassword = sc.nextLine();
		System.out.println("나이 입력:");
		int memberAge = sc.nextInt();
		Member memb = new Member(memberName, memberId, memberPassword, memberAge);
		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = memb;
				break;

			}

		}

	}

	private static void getMemberList() {
		for (Member a : memberAry) {
			if (a != null)
				System.out.println(a.getName() + ", " + a.getId());
		}

	}

}
