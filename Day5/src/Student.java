
public class Student {
	
	String name;			// 이름, 국,영,수 점수를 선언한다.
	int kor;
	int eng;
	int math;

	Student(){}
	Student(String name, int kor, int eng, int math){	//생성자 함수를 통해 초기화 한다.
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	public int total() {	//총점을 구하기 위해 total 함수를 생성
		return kor+eng+math;
	}
	
	public float avg() {	//평균을 구하기 위해 avg 함수를 생성
		return total()/3;
	}
	
}
