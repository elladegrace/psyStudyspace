package ch02;

public class SwitchStringExample {

	public static void main(String[] args) {
		String position="����";
	/* java 1.7 ���� ���� switch�� case������ ���ڿ��� ����Ҽ� ���� */	
	  switch(position) {
	  case "����":
		  System.out.println("700����");
		  break;
	  case "����":
		  System.out.println("500����");
		  break;
	  default:
		  System.out.println("300����");
	  }

	}

}
