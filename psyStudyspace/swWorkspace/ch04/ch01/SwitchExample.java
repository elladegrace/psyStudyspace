package ch01;

public class SwitchExample {

	public static void main(String[] args) {
		int time=10;
		
		//�ش� case���� ���� ����
		switch(time) {
		case 8: System.out.println("���");
		case 9: System.out.println("���");
		case 10: System.out.println("ȸ��");
		case 11: System.out.println("�ܱ�");
		}
		
		//����case�� �����ؼ� �������� �ʰ�
		//�ش� case�� �����ϴ� ���, �ش� case�� break�� �����.
		int score=85;//85/10 => 8
		switch(score/10) {//
		case 9:
		case 10: System.out.println("A");
		        break;
		case 8: System.out.println("B");
		        break;
		case 7: System.out.println("C");
		        break;
		default:System.out.println("F");
		}
		
	   	
		
		
	}
}
