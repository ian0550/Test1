package Class_20210106;

public class Class_2 {


	public static void main(String[] args) {
		Student2 s = new Student2();
        s.setName("ȫ�浿");
        s.setEmail("nichipaloma@naver.com");
        s.setTel("010-1010-0101");
        
        System.out.println("�̸� : " + s.getName());
        System.out.println("�̸��� : " + s.getEmail());
        System.out.println("��ȭ : " + s.getTel());
        System.out.println("���� : " + Student2.category);
        
        Student2 ss = new Student2();
        ss.setName("�ڱ浿");
        ss.setEmail("soobasiba@naver.com");
        ss.setTel("010-3333-1111");
        
        System.out.println("�̸� : " + ss.getName());
        System.out.println("�̸��� : " + ss.getEmail());
        System.out.println("��ȭ : " + ss.getTel());
        System.out.println("���� : " + Student2.category);
        
        // �͸� ��ü
        new Student2().setName("���浿");
        System.out.println(new Student2().getName());
	}

}
// �ּҷ� Ŭ���� ����
class Student2 {
	//Ŭ���� ����
	static String category = "��������SW����";
	
	//public : �ܺ� Ŭ�������� ���� �����ϰ� ����.
	//private : �ܺ� Ŭ������ ���� �Ұ���.
	// �ν��Ͻ� ����
	private String name;
	private String tel;
	private String email;
	
	// �ν��Ͻ� �޼ҵ�
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

