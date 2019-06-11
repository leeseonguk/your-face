
public class MyStack extends Memory{////Memory를 상속받음

	public int pop() {			//부모한테 받았어 이건 꼭 써야징~
		return arr[--index];
	}

}
