package Class_20210106;

public class Student2 {
	
	//클래스 변수
	static String category = "통합응용SW과정";
	
	//public : 외부 클래스에서 접근 가능하게 만듦.
	//private : 외부 클래스에 접근 불가능.
	// 인스턴스 변수
	private String name;
	private String tel;
	private String email;
	
	// 인스턴스 메소드
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}




