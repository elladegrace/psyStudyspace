package ch05;

public class NestedLoopGuguExample2 {
	public static void main(String[] args) {
	 //����,���� 2���� ���·� ���� ����ϰų� ����Ҷ� ���߹ݺ��� ���
	  for(int i=1;i<10;i++) {
		  for(int j=1;j<10;j++) {//����for���� �ݺ�Ƚ��=�ٱ��ʹ���*���ʹ���
			  System.out.print(j+"x"+i+"="+i*j+"\t");
		  }//���� for�� ��
		  System.out.println();//��������� ���� �Ʒ��� ������
	  }//�ٱ��� for�� ��
	}
}
