package ch12;

public class Member {
	//필드
	String name;
	int age;
	String address;
	String email;
	String phone;
	
	//생성자
	public Member() {
		this("회원님",14,"서울시");
	};
	public Member(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	//this(매개변수); //같은 클래스내의 다른 생성자를 호출하는 메소드
	//주의 반드시 첫번째 줄 명령문으로 기술;
	public Member(String name, int age, String address, String email) {
		this(name,age,address);//이 문장을 사용하면 아래 3줄은 적지 않아도 된다.
		this.name = name;//
		this.age = age;//
		this.address = address;//
		this.email = email;
	}
	
	public Member(String name, int age, String address, String email, String phone) {
		this(name,age,address,email);//이 문장을 사용하면 아래 4줄은 적지 않아도 된다.
		this.name = name;//
		this.age = age;//
		this.address = address;//
		this.email = email;//
		this.phone = phone;
	}
}
