/*
 *  Overridingg
 *  
 *  1. Super Class 와 Sub Class가 똑같은 형태의 멤버를 가지고 있는 것
 *  
 *  2. 
 *  
 */


public class B extends A{


	private int age;

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

	
	public String toString() {
//		return getName()+"\t"+getAge();
		return super.toString()+"\t"+getName()+"\t"+getAge();
	}
	
	
	
	
	///생성자

	public B() {
		//super(); 자식이 부모의 생성자를 호출 // 자식 생성자의 가장 위 라인에 있음// 단 명시적으로 쓸 경우 디폴트는 없다.
		System.out.println("B 생성자");

	}

	public B(String name,int age){
		super(name);
		this.age=age;
	}




	public static void main(String[] args) {


		B bb= new B("Superman",1000);
		bb.setName("superman");
		bb.setAge(1000);

		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		
		System.out.println(bb);
	}

}
