package ch03;

//booleanŸ���� ���ͷ��� true/false 2�� ����.
public class LiteralExampleBoolean {

	public static void main(String[] args) {
		//booleanŸ�� ���� ���� �� true���ͷ� ����
		boolean a=true;
		//booleanŸ�� ���� ���� �� �ʱⰪ���� ������ ����� true����
		boolean b=10<0;  //int result=value+20;
		//booleanŸ�� �������� intŸ���� �� ���� �Ұ�
		//boolean c=1;
		
		System.out.println("b:"+b);
		
		//���ǹ����� ���̸� ���κ��� ����, �����̸� ���κ��� ����ħ.
		if(a) {
			System.out.println("hello!! a�� true�Դϴ�.");
		}
		
		int i=1;
		//�ݺ���
		while(a) {
			System.out.println("hi");
			//if ������ ���� ���̸� ������ a=false��ɹ� ����
			if(i==10) {//i�� ���� 10�� ������ ���ϴ� ������ �񱳿����ȣ�� ==
				a=false;//���� ���Խô� =
			}
			i=i+1;
		}

	}

}
