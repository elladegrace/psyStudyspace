package ch01;

public class NestedIfExample1 {
	public static void main(String[] args) {
		int score =(int)(Math.random()*20)+81;//0~19+81
		System.out.println("����: "+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {//95~100
				//grade="A+";
				if(score==95) {
					grade="A";
				}else
					grade="A+";
			}else {//90~94
				grade="A-";
			}
		}else {//81~89
			if(score>=85)
				grade="B+";
			else 
				grade="B";
		}
		
		System.out.println("����:"+grade);
		
	}

}
