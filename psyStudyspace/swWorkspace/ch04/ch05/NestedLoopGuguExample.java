package ch05;

public class NestedLoopGuguExample {
	public static void main(String[] args) {
	  for(int i=1;i<10;i++) {
		  for(int j=1;j<10;j++) {//����for���� �ݺ�Ƚ��=�ٱ��ʹ���*���ʹ���
			  System.out.print(i+"x"+j+"="+i*j+"\t");
		  }//���� for�� ��
		  System.out.println();//��������� ���� �Ʒ��� ������
	  }//�ٱ��� for�� ��
	}
}
