package exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		try {
		arr[7]=58;
		System.out.println("result:"+arr[7]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
		}
	}

}
