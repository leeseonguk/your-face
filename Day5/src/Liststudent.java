
public class Liststudent {

	public static void main(String[] args) throws InterruptedException {


		int[]arr=new int [3];

		try {

			//int a=3/0;

			for(int i = 0 ;i<4;i++) {
				
				
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("야 배열");
		}catch(ArithmeticException e) {
			System.out.println("0 으로 나누지 말라고...");

			
			System.out.println();
			//System.exit(-1);
		}
		finally {
			System.out.println("끝이야...");
		}
	}

}