package interview_coding;

import java.util.Scanner;

public class Prime_number {
	public static void isPrimeNumber(int num) {
		int count=0;
		int temp=num/2;
		for(int i=2;i<=temp; i++) {
			if(num%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0)
			System.out.println("prime number : "+num);
		else
			System.out.println("not a prime number : "+num);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter number to check, number is prime or not :");
			int num=sc.nextInt();
			isPrimeNumber(num);
		}
		sc.close();
	}

}
