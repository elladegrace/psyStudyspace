package ch02;

import java.util.Date;

public class ArithmaticOpExample3 {

	public static void main(String[] args) {
		int time=5000;
		
		int second=time%60;//��
		int minute=(time/60)%60;//��
		int hour =(time/60)/60;//�ð�
		
		System.out.println(time+"�ʴ�");
		System.out.println(hour+"�ð�,");
		System.out.println(minute+"��,");
		System.out.println(second+"���Դϴ�.");
		
		//��¥����api�� �̿��Ͽ�  ��¥���
		Date now =new Date();
		System.out.println(now);
		System.out.println(now.getTime());//1970,1,1,0�������� �и��������� �� 

	}

}
