package hello;

public class Member {
	private String name;
	private String course;
	private String password;
	private int memberNo;

	Member() {

	}

	Member(String name, String course) {
		this.name = name;
		this.course = course;

	}
	
	Member(String name, String course, String password, int memberNo){
		this.name = name;
		this.course = course;
		this.password = password;
		this.memberNo = memberNo;
		
	}

	public Member(int sNumber, String sName, int s1, int s2, int s3) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int age) {
		this.memberNo = memberNo;
	}

}
