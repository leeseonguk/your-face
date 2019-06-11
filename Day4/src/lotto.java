
public class lotto {
 public static void main(String[] args) {
  int[] num = new int[7];
      
  for(int i=0; i<7; i++) {
   num[i] = (int)(Math.random()*45)+1; //1~45 랜덤 숫자
      
   for(int j=0;j<i;j++) {   //중복검사
    if(num[j] ==num[i]) {
     i--;
     break;
    }
   }
  }
  System.out.println("로또 당첨번호");
  for(int i=0; i<7 ;i++) {
   System.out.print(num[i]+",");
  }
  System.out.println();
 }
}