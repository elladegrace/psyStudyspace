package ch07;
/*. 홍길동의 수학, 영어, 국어 점수는 각각 85, 90, 55 [85][90][55]{85,90,55}
일지매의 수학, 영어, 국어 점수는 각각 90, 77, 88 [90][77][88]{90,77,88}
임꺽정의 수학, 영어, 국어 점수는 각각 87, 80, 66 [87][80][66]{87,90,66}
입니다.
세명의 개별 총점과, 평균을
2차원 배열을 생성하여 for문으로 구하시오. 
*/


public class TwoDimensionScoresExample2 {
  public static void main(String[] args) {
		
  int[][] scores ={{85,90,55},{90,77,88},{87,90,66}} ;
 
   int total=0;
   int count=0;
   
   for(int i=0;i<scores.length;i++) {
   	 int sum=0;
   	 for(int j=0;j<scores[i].length;j++) {
   		 sum+=scores[i][j];
   		 total+=scores[i][j];//��Ż�հ�
   		 count++;//���� �Ǽ�
      }
   	 System.out.println("합계:"+sum+",평균:"
                         +(double)sum/scores[i].length);
     }
   //
   System.out.println("토탈합계"+total);
   System.out.println("전체 건수:"+count);
   System.out.println("전체 평균:"+(double)total/count);
	}
}
