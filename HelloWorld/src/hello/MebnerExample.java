package hello;

import java.util.Scanner;

public class MebnerExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("석시현");
		m1.setId("ssh");
		m1.setPassword("ssh123");
		m1.setAge(32);

		Member m2 = new Member("관리자", "admin");
//		m2.setName("관리자");
//		m2.setId("admin");
		m2.setPassword("admin12");
		m2.setAge(0);

		Member m3 = new Member("사용자1", "user1", "user123", 10);
 
     	Member[] memberAry = {m1, m2, m3};
     	Scanner sc = new Scanner(System.in);
//     	System.out.println("조회할 id 입력: ");
//     	String id = sc.nextLine();
       	System.out.println("조회할 이름 입력: ");
     	String name = sc.nextLine();
     	for (Member m : memberAry) {
//     		if(m.getId().contentEquals(id))
//     			System.out.println("==> "+m.getName()+","+m.getId()+","+m.getPassword()+","+m.getAge());
       		if(m.getName().contentEquals(name))
     			System.out.println("==> "+m.getName()+","+m.getId()+","+m.getPassword()+","+m.getAge());
     	}
	
	
	}
}
