package ch02;

public class ArithmaticOpExample2 {

	public static void main(String[] args) {
		//�ڿ����� �� ¦�� /Ȧ�� ���� Ȯ���ϱ�
	/*	for(int i=1;i<=100;i++) {
			if(i%2==0)System.out.println(i+"�� ¦��");
			else System.out.println(i+"�� Ȧ��");
		}
  */
	/*	for(int i=10;i<100;i++) {
			if(i/10%2==0)System.out.println(i+"�� ���ڸ��� ¦��");
			if((i%10)%2==0) System.out.println(i+"�� �����ڸ��� ¦��");
		}
	*/	
		for(int i=1;i<100;i++) {
			String str="";
			if(i/10%3==0 & i>10 ) str="¦";
			if((i%10)%3==0 & (i%10)!=0)str=str+"¦";//"¦¦"
			System.out.println(i+":"+str);
		}
	}

}
