package ch08;

public class OperationExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue2 =20;
		
		//byte,short,char,int Ÿ���� ����Ŀ� ������ ��� intŸ���� ��ȯ
		//byte result = byteValue + byteValue2;
		int result=byteValue + byteValue2;
		
		
		//����ȯ:�⺻����Ÿ Ÿ��(byte<short<int<long<float<double)
		//����ũ�Ⱑ ���� ����Ÿ Ÿ���� ū Ÿ������ �ڵ� ����ȯ
		//����ũ�Ⱑ ū ����Ÿ Ÿ���� ���� Ÿ������ ���� ����ȯ������Ѵ�.
		double result2 = 10/2.0;//int/double -> double/double->10.0/2.0
		System.out.println(result2);
		
		//���ڿ��� �ٸ� �⺻Ÿ�԰��� �������� ������ ���ڿ� Ÿ��
		String str="jdk";
		String message = str+3+3.0; //���ڿ�+int+double-> ���ڿ�+���ڿ�+double("jdk"+"3"+3.0)-> ���ڿ�+���ڿ�+���ڿ�("jdk33.0")
		System.out.println(str+(3+3.0));//"jdk6.0"

	    	
	}
}
