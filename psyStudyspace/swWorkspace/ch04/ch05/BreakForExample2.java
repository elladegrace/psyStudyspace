package ch05;

public class BreakForExample2 {
//�ٱ� �ݺ��� �տ� ��: �� ǥ���ϰ�, ���� �ݺ������� break ��; �� ǥ��
//�ٱ� �ݺ��� ���� ���.
	public static void main(String[] args) {
	 a:	for(int i=1;i<10;i++) {
			for(int j=1;j<=10;j++) {
				 if(j==10) break a;//���� for�� �� ��������
				 System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
