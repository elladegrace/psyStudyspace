package ch04;

//�⺻Ÿ��(byte,short,char,int,long,float,double,boolean)��
//�񱳿��� ==, != >,<,>=,<=
public class CompareOperationExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1==num2);//������?
		boolean result2 = (num1 !=num2);//�ٸ���?
		boolean result3 = (num1 <=num2);//�̻��ΰ�?
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 ='A';
		char char2 ='B';
 boolean result4 = char1 < char2;// 66 < 67-charŸ�� ���� ����� intŸ������ ��ȯ.
		System.out.println(result4);

	}

}
