package ch07;

import java.util.Scanner;

public class ScannerInputExample {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ�� �и��Ͽ��Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���>");
		String name=scanner.next();
		System.out.println("�������� �Է��ϼ���>");
		String city=scanner.next();
		System.out.println("���̸� �Է��ϼ���>");
		int age=scanner.nextInt();
		System.out.println("�����Ը� �Է��ϼ���>");
		double weight=scanner.nextDouble();
		System.out.println("���ſ���(true/false)�� �Է��ϼ���>");
		boolean single=scanner.nextBoolean();
		
		System.out.println("�̸�:"+name+",������:"
		                    +city+",����:"+age+",������:"
				            +weight+",���ſ���:"+(single?"�̱�":"��ȥ"));
		//�ڿ�����
		scanner.close();
	}
}
