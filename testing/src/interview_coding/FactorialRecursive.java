package interview_coding;

public class FactorialRecursive {
	public static int factorial(int num) {
		if(num==0 || num==1)
			return 1;		
		else
			return num*factorial(num-1);
}

	public static void main(String[] args) {
		int num=10;
		int fac=factorial(num);	
		System.out.println("number is: "+num);
		System.out.println("factorial of number is: "+fac);
	}
}
