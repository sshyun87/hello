package hello;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	Member() {

	}

	Member(String name, String id) {
		this.name = name;
		this.id = id;

	}
	
	Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
		
	}

	public Member(int sNumber, String sName, int s1, int s2, int s3) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
