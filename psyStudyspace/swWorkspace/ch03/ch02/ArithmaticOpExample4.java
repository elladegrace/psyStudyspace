package ch02;

import java.util.Scanner;

public class ArithmaticOpExample4 {
	public static void main(String[] args) {
		//Ű����� ���� �� �о� ���̴� ��ü ����
		Scanner scanner = new Scanner(System.in);
		int time;
		
		System.out.println("����� ���ϴ� �ʸ� ���������� �Է��ϼ���:");
		time=scanner.nextInt();//�Էµ� ���� ����(int)�� ��ȯ�Ͽ� ������ ����
		
		int second=time%60;//��
		int minute=(time/60)%60;//��
		int hour =(time/60)/60;//�ð�
		
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�,");
		System.out.println(minute+"��,");
		System.out.println(second+"���Դϴ�.");
		
		

	}

}
