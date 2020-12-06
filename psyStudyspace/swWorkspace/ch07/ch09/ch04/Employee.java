package ch09.ch04;

public abstract class Employee {
	private String name;
	int sal;
	private static final float INCENTIVE_RATE=0.1f;
	public Employee(String[] args) {this.name=name;}
	
	// 추상메소드 - 급여 계산 메소드
	abstract int computerPay();
	// 보너스 계산 메소드
	final int computerIncentive() {
		int pay=computerPay();
		int bonus=0;
		if(pay>10000)
			bonus=(int)(pay*INCENTIVE_RATE);
		return bonus;
	}
	// 보너스 출력 메소드
	void print() {
		System.out.println("=================");
		System.out.println("이름 : "+name);
		System.out.println("급여 : "+sal);
		System.out.println("보너스 : "+computerIncentive());
	}
}
