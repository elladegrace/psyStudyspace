package ch02;

public class SwitchExample1 {

	public static void main(String[] args) {
		//Math.random()�Լ��� ���� 0.0<= <1.0
		//System.out.println(Math.random());
	  int num=(int)(Math.random()*6)+1;//0+1~5+1
	  System.out.println(num);
	  
	  switch(num) {
	  case 1: System.out.println("����1�� ���Խ��ϴ�."); 
	          break;
	  case 2: System.out.println("����2�� ���Խ��ϴ�."); 
	          break;
	  case 3: System.out.println("����3�� ���Խ��ϴ�."); 
	          break;
	  case 4: System.out.println("����4�� ���Խ��ϴ�."); 
	          break;
	  case 5: System.out.println("����5�� ���Խ��ϴ�."); 
	          break;
	  default: System.out.println("����6�� ���Խ��ϴ�."); 
	          break;
	  
	  }
	  

	}

}
