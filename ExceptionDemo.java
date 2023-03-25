package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println("Divided by zero is not possible");
//			System.out.println("Exception occured:"+e.getMessage());
		}
		System.out.println("Rest of the code");
//		String s="abc";
//		int a=Integer.parseInt(s);
//		int arr[]=new int[5];
//		arr[10]=8;
//		System.out.println(arr[10]);
		
	}
}
