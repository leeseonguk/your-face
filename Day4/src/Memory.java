
public abstract class Memory {


	protected int arr[];  //접근 범위에 따라 private, protected, default 선택
	protected int index;

	//생성자//
	public Memory() {		
		arr = new int[5];
		int index=0;
	}




	//	public Memory(int count) {
	//		arr=new int[count];
	//	}


	public  void push(int index) {
		arr[this.index++] = index;

		//arr[index++]=index;
	}

	public abstract int pop();  //추상화시켜서 동적바인딩 시킴으로 자식클래그가
	// pop를 꼭 갖고 있게한다.
}


