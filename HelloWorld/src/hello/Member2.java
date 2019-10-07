package hello;

public class Member2 {
	private String name;
	private String course;
	private int memberNo;

	Member2() {

	}

	Member2(String name, String course) {
		this.name = name;
		this.course = course;

	}
	
	Member2(String name, String course, String password, int memberNo){
		this.name = name;
		this.course = course;
		this.memberNo = memberNo;
		
	}

	public Member2(int sNumber, String sName, int s1, int s2, int s3) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcourse() {
		return course;
	}

	public void setcourse(String course) {
		this.course = course;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int age) {
		this.memberNo = memberNo;
	}

}
