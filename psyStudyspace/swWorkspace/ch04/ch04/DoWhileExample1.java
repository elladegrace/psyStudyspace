package ch04;

public class DoWhileExample1 {
	public static void main(String[] args) {
		char c='a';
		//�� ������ �� ���������� ���� üũ
		do {
			System.out.print(c+" ");
			c=(char)(c+1);// 97+1=>(char)98-> 'b' 
		}while(c<='z');
		
	}
}
