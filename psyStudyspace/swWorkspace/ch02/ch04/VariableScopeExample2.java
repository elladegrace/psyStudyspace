package ch04;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		int v1=15;
		
		if(v1>10) {
			int v2=v1-10;
		}
		
		//main()�޼ҵ� ���� if������ ����� ���� v2�� ���� ����� ���Ұ�
		//int v3=v1+v2+5;

	}
}
