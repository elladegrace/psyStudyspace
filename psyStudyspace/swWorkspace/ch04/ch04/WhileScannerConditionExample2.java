package ch04;

import java.io.IOException;
import java.util.Scanner;

public class WhileScannerConditionExample2 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		boolean run=true;
		int speed=0;
		int keyCode=0;
		
		while(run) {
			//�޴� ���
				System.out.println("----------------");
				System.out.println("1.����|2.����|3.����");
				System.out.println("----------------");
				System.out.println("����:");
			
			keyCode = scanner.nextInt();
			
			if(keyCode==1) {//ascii�ڵ� 1
				speed++;
			  System.out.println("����ӵ�="+speed);
			}else if(keyCode==2) {//ascii�ڵ� 2
				speed--;
			  System.out.println("����ӵ�="+speed);
			}else if(keyCode==3) {//ascii�ڵ� 3
				speed++;
			   run=!run;
			}
		}//while��.
		System.out.println("����");
	}
}
