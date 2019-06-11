import java.util.ArrayList;
import java.util.Scanner;

public class MainScore {


	public static void main(String[] args) {

		ArrayList<Student> slist=new ArrayList<Student>();	//Student 클래스를 Arraylist 형태로 불러와 slist에 저장한다.

		Scanner sc=new Scanner(System.in);		//입력받은 값을 사용하기 위해 Scanner 클래스를 실행한다.





		while(true) {
			System.out.println("/---------------------------------------------------------------------------------------/");
			System.out.println("| 1.성적입력	2.성적검색		3.수정		4.성적삭제		5.전체출력		6.종료	|");
			System.out.println("/---------------------------------------------------------------------------------------/");


			int input=sc.nextInt();		//input 변수는 입력받은 값.


			if(input==1) {
				System.out.println("이름을 입력하세요");

				String name=sc.next();

				System.out.println("국어점수를  입력하세요");
				int kor= sc.nextInt();

				System.out.println("영어점수를  입력하세요");
				int eng= sc.nextInt();

				System.out.println("수학점수를  입력하세요");
				int math= sc.nextInt();

				slist.add(new Student(name, kor, eng, math));	//Student의 ( name, kor, eng, math) 값을
				//만들어진 Arraylist에 추가한다.
			}
			else if(input==2) {
				System.out.println("검색한 학생의 이름을 입력하세요");
				String name=sc.next();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {			//slist.get(i).name.equals(name))을 통해
						System.out.print(slist.get(i).name+"\t");	//가져온 i번째 값과 같은 이름명을 찾아 출력한다.
						System.out.print(slist.get(i).kor+"\t");
						System.out.print(slist.get(i).eng+"\t");	
						System.out.print(slist.get(i).math+"\t");
						System.out.print(slist.get(i).total()+"\t");
						System.out.print(slist.get(i).avg()+"\t");
						System.out.println();


					}

				}

			}
			else if(input==3) {
				System.out.println("수정할 학생의 이름을 입력하세요");
				String name=sc.next();


				System.out.println("수정할 과목을 입력하세요."+"\n"+"1.국어성적 "+"2.영어성적 "+"3.수학성적 ");
				int a=sc.nextInt();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {		
						if(a==1) {
							slist.get(i).setKor(sc.nextInt());}	//slist.get(i).setKor()를 이용해 가져온 값을 입력받는 값으로 바꾼다.
						else if(a==2) {
							slist.get(i).setEng(sc.nextInt());}
						else if(a==3) {
							slist.get(i).setMath(sc.nextInt());}

					}
				}
			}
			else if(input==4) {
				System.out.println("삭제할 학생의 이름을 입력하세요");
				String name=sc.next();
				for(int i=0;i<slist.size();i++) {
					if(slist.get(i).name.equals(name)) {
						slist.remove(i);					//slist.remove(i); i번째 어레이를 삭제한다.
					}
				}

			}
			else if(input==5) {
				System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균");
				for(int i=0;i<slist.size();i++) {
					System.out.println(slist.get(i).name+"\t"+slist.get(i).kor+"\t"+slist.get(i).eng+"\t"+slist.get(i).math+"\t"+slist.get(i).total()+"\t"+slist.get(i).avg());


				}

			}
			if(input==6) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}