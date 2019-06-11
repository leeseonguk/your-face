
/*
 * 1. member inner class   OUTTER CLASS 멤버를 자유롭게 사용할 수 있게 해준다.
 * 2. static inner class
 * 3. local inner class   몰라두 됨
 * 4. annonymous inner class   휘발성 
 * 
 * 
 * 	Class A{
 * 
 * 			ClassB{
 * 
 * 
 * 			}	
 * 
 * 
 * }
 * 
 * 
 */





class A{
	private int a;

	public A() { System.out.println("A");
	a=30;
	}


	class B{
		public B() {
			a=50;
			System.out.println("B"+a);
		}
	}

	public static void main(String[] args) {

		// A aa=new A();
		// A.B bb= aa.new B();
		A.B aa1=new A().new B();
	}
}
