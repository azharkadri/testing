package interview_coding;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=reverse(num);
		System.out.println("without reverse :"+num);
		System.out.println("with reverse :"+rev);
		sc.close();
	}
	public static int reverse(int num) {
		int rev=0;
		
		while(num>0) {
			rev=(rev*10)+num%10;
			num=num/10;			
		}
		return rev;
	}
}
