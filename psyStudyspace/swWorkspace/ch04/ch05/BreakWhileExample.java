package ch05;

public class BreakWhileExample {

	public static void main(String[] args) {
		//�ʱⰪ
		int i=1,j=1;
		
		while(i<10) {//���������� ����
			while(true) {//���������� ����
				 if(j==10) break;//���� for�� �� ��������
				 System.out.print(i+"x"+j+"="+i*j+"\t");
				 j++;//j����
			}
			System.out.println();
			i++;//i�����ϰ�
			j=1;//j�� 1�� �ʱ�ȭ ����
		}
	}

}
