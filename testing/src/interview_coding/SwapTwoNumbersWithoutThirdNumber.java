package interview_coding;

public class SwapTwoNumbersWithoutThirdNumber {

	public static void main(String[] args) {
		int a,b;
		a=10;b=20;
		System.out.println("before swapping");
		System.out.println("first number: "+a);
		System.out.println("second number: "+b);
		//a=a+b;  
		//b=a-b;  
		//a=a-b;  
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping");
		System.out.println("first number: "+a);
		System.out.println("second number: "+b);
	}

}
