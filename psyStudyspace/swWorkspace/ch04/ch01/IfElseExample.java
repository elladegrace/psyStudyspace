package ch01;

//if-else�� �� �� �ϳ��� ���� �ݵ�� ����Ǿ���ϴ� ��� ���.
public class IfElseExample {
	public static void main(String[] args) {
		 int n;
		 n=9;
		 //���ǹ�(if)
		 if(n%2==0) {//���Ǻκ��� true�϶��� ������ ��ɹ� ����{}
			 System.out.println("¦���Դϴ�.");
		 }else {//if���� ������ ��� else�� ���� ��ɹ� ����
			 System.out.println("Ȧ���Դϴ�.");
		 }
		 
		//score�� 60�̻��� �л��鿡�Ը� pass���θ� �˷���.
		 int score=55;
		 if(score>=60) {//���� true�� ����Ǵ� ��
			 System.out.println("pass");
		 }else {//���� false�� ����Ǵ� ��
			 System.out.println("fail");
		 }
		 
	}
}
