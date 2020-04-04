package interview_coding;

import java.util.Scanner;

public class PalindromeNumber {
	public static void isPalindrome(int num) {
		int dup=num,rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		if(dup==rev) {
			System.out.println("yes, palindrome number: "+rev);
		}
		else
			System.out.println("no, not a palindrome number: "+rev);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		isPalindrome(num);
		sc.close();
	}

}
