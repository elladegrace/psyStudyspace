package ch07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerInputExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//��ū������ �ƴ� ���� ������ �Է¹޴� �޼ҵ� nextLine();
		String str =scanner.nextLine();
		
		StringTokenizer st=new StringTokenizer(str);
		//�����ϱ�
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		

	}

}
