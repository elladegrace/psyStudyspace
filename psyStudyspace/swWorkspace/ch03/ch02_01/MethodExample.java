package ch02_01;

public class MethodExample {
 public static void main(String[] args) {
	//����Ÿ���ִ� �޼ҵ�ȣ��� ������� �޾Ƽ� ó��
	int result1=method1(5); 
	System.out.println(result1);
	
	//voidŸ�� �޼ҵ�ȣ�� �޼ҵ��ȣ��
	method2(5);
	//���� �޾ʰ� ����� �����ϴ� �޼ҵ� ȣ��
	String message=method3();
	System.out.println(message);
	
	//�Ű����� �����ʰ� ���ϰ��� ���� �޼ҵ� ȣ��
	method4();
 }	
	//���� �Է¹ް� ����� �ǵ����ִ� �޼ҵ�
	static int method1(int x) {
		return x+10;
	}
	
	//���� �Է¹ް� ����� �ǵ��������ʴ� �޼ҵ�
	static void method2(int x) {
		System.out.println(x);
	}
	
	//���� �����ʰ� ����� �ǵ����ִ� �޼ҵ�
	static String method3() {
		return "����� �ǵ���������";
	}
	
	//���� �����ʰ� ����� �ǵ��������ʴ� �޼ҵ�
	static void method4() {
		System.out.println("�����ȹް� �ǵ�������������");
	}
	
	
	

}
