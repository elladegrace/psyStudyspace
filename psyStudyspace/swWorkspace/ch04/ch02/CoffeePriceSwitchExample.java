package ch02;

import java.util.Scanner;

public class CoffeePriceSwitchExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� Ŀ�� �帱���?");
		
		String order = scanner.next();
		int price=0;
		int americano=10;
		
		switch(order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price =3500;
			break;
		case "�Ƹ޸�ī��":
			price =2000;
			americano--;
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
		}
		if(price!=0)
			System.out.println(order+"��"+price+"���Դϴ�."+"���� �ܼ��� "+americano);
		
		scanner.close();
			
	}
}
