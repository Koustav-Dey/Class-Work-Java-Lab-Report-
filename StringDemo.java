package basicprograms;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1="computer";
//		String str2="computer";
//		String str3="com"+"puter";
//		String str4="Bond";
//		String str5="My name is"+str4;
//		String str6="My name is Bond";
//		String str1=new String("My name is bond");
		String s1="computer";
		String s2="computer";
		String s3=new String("computer");
		System.out.println("Result1:"+(s1==s2)); //true
		System.out.println("Result2:"+s1.equals(s2)); //true
		System.out.println("Result3:"+(s1==s3)); //false
		System.out.println("Result4:"+s1.equals(s3)); //true
		}
}
