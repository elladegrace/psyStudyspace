package ch04;
//������ ����� ���������� ��밡��
public class VariableScopeExample {

	public static void main(String[] args) {
		int var1=0;
		
		if(true) {
			int var2=0;
			System.out.println(var1);
			System.out.println(var2);
		}
		System.out.println(var1);
		//main�޼ҵ庸�� �Ʒ��� if�������� ����� ������ if���� ����� ���Ұ�
		//System.out.println(var2);
		
		for(int i=0;i<5;i++) {
			int var3=0;
			System.out.println(var1);//���������� var1�� ��밡��
			System.out.println(var3);
			//���� ������ �ٸ� ������ ����ϴ� var2�� ���Ұ�
			//System.out.println(var2);
		}
		
		System.out.println(var1);//��밡��
	//System.out.pritln(var3);//���������� ������ ������ var3�� ���� ��� ���Ұ�
		

	}

}
