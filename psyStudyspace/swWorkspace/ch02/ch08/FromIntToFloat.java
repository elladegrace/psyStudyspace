package ch08;

public class FromIntToFloat {

	public static void main(String[] args) {
    //����(int)
	 int num1 =123456780;
	 int num2 =123456780;
	 
	 System.out.println(num1 - num2);
	 
	 //������ ���� �Ǽ��� ��ȯ�� floatŸ������ ��ȯ�ϸ� ������ �߻��Ҽ� ����.
	 //�Ǽ�(float)
	 //123456780=>0b111010110111100110100001100=>1.xxx*2^n -> ����:127+n, ����xxx;
	 //1.23456784E8
	 float num3 =num2;
	 
	 System.out.println("num3:"+num3);
	 
	 num2=(int)num3;
	 System.out.println("num2:"+num2);
	 
	 int result = num1 - num2;
	 
	 System.out.println(result);
	 

	}

}
