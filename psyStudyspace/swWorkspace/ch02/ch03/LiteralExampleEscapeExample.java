package ch03;
//���ͷ��� ���Ǵ� ������ \�� �����ϴ� ���ڴ� Ư�����
public class LiteralExampleEscapeExample {

	public static void main(String[] args) {
		//���� �ο��ȣ ���� \"�� ���
		String st1="ȫ����� \"�ȳ��ϼ���\"��� ���ߴ�";
		System.out.println(st1);
		//���� �ο��ȣ ���� \'�� ���
		String str2="\'java\'�� ��մ�";
		System.out.println(str2);
		
		//�齺���̽� \b
		String str3="������ ���ٰ�\b  �ڷ� ��ĭ ����.";
		System.out.println(str3);
		
		//������ \r, \n, \r\n
		String str4="�����ٷ� �̵� \r\n ���������";
		System.out.println(str4);
        
		//�Ǹ�ŭ ���� \t
		String str5="�� ����ŭ\t �ǳʶٱ�";
		System.out.println(str5);
		
		// \���� ǥ�� \\
		String str6="c:\\temp";
		System.out.println(str6);
	}

}
