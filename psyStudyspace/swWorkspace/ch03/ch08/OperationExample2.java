package ch08;

public class OperationExample2 {

	public static void main(String[] args) {
		byte b = -10;//-10 ���ͷ� -10
		//byte result = -b;//��ȣ���� -(-10) => +10; intŸ������ ��ȯ
		int result = -b;
		
		int x=10;
		int y=10;
		
		//���� ���� 1�� ����, �ܵ� �����  ����  ��,�� ������� 1�� ����
		x++;//����
		System.out.println(x);
		++x;//����
		System.out.println(x);
		
		//���� ���� 1�� ����, �ܵ� ����� ���� ��,�� ������� 1�� ����
		--y;//����
		System.out.println(y);
		y--;//����
		System.out.println(y);
		
		
		//++�����ڰ� ����x�տ� �ִ� ��� ���� ������ ���꿡 ����
		//++�����ڰ� ����y�ڿ� �ִ� ��� ������ ������ ���꿡 ���� �� ����
		int z=++x + y++;
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		//������
		//if��, �ݺ����� �������� ���
		boolean b1 = true & false;//���� ���� & ������ ��� true/false
		
		b1 = 10>5 & 1!=1;// 10>5���true, 1!=1 false, true & false����� false
		
		//��, ������ ���� (%)
		//¦��,Ȧ��
		int intValue=10;
		if(intValue%2==0) System.out.println("¦��");
		
		//�ڹ��� intŸ�� �������� int, int/int�� int �� ���
		int result3 = 534 / 12;
		System.out.println(result3);
		
		//���� ���� -if-else���� ��ü�� ��
		String result4 = intValue%2==0?"¦��":"Ȧ��";
		System.out.println(result4);
		

	}
}
