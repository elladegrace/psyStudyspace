package ch07;

public class ThreeConditionOperationExample {

	public static void main(String[] args) {
		int score=95;
		char grade = score>90?'A':'B';
		System.out.println("���:"+grade);
		
		if(score>90) {
			grade='A';
		}else {
			grade='B';
		}
		System.out.println("���:"+grade);
		
		//�μ��� ���� ���
		int a=3,b=5;
		System.out.println("�μ��� ���� "+((a>b?a-b:b-a)));
		

	}
}
