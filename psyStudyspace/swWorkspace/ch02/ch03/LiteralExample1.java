package ch03;

//���� ���ͷ�
//�������ͷ��� intŸ���� ����Ÿ��
//���ͷ��ڿ� l�̳� L�� ������ intŸ�� ���ͷ��� ������.
public class LiteralExample1 {

	public static void main(String[] args) {
	//�������ͷ� 
	  int n=15;//10����
	  int m=015;//8����(octa) 0+8��������, 1*8^1+5
	  int k=0x15;//16����(hexa) 0x+16��������, 1*16^1+5
	  int b=0b0101;//2����(binary) 0b+2��������, 1*2^2+1
	  
	  //����Ÿ���� ���� l�� int�� �ι������ ���� �����Ҽ� �ִ� longŸ��.
	  long l=24L;//�⺻������ longŸ���� ���ͷ��� �ڿ� L�̳� l�� ����.
	  
	//10����,8����,16����,2������ ���ͷ��� ������ ����Ǵ���
	//����� ����� ��� 10������ ��ȯ�Ǿ� �����.
	  System.out.println(n);
	  System.out.println(m);
	  System.out.println(k);
	  System.out.println(b);
	  System.out.println(l);

	}

}
